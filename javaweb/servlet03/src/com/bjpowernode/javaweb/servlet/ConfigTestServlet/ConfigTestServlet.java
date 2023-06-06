package com.bjpowernode.javaweb.servlet.ConfigTestServlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/*
ServletConfig
1.  ServletConfig 是什麼
    Jakarta.servlet.ServletConfig 顯然 ServletConfig 是 Servlet 規範中的一員；
    ServletConfig 是一個接口 ( jakarta.servlet.Servlet 亦是一個接口)
2.  誰去實現這個接口?
    A: WEB 服務器實現了
    public class org.apache.catalina.core.StandardWrapperFacade 這個類 implements ServletConfig {}
    結論: Tomcat 服務器實現了 ServletConfig 接口
    思考: 如果把 Tomcat 服務器換成 jetty 服務器，輸出 ServletConfig 對象的時候，還是這個結果嗎?
      A: 不一定一樣，包名、類名可能和 Tomcat 不一樣，但他們都實現了 ServletConfig 這個規範。
3.  一個 Servlet 對象中有一個 ServletConfig 對象 aka Servlet 和 SerlvetConfig 對象是一 對一。
4.  ServletConfig 對象是誰創建的? 在什麼時候創建的?
    Tomcat 服務器 ( WEB 服務器 ) 創建了 ServletConfig 對象
    在創建 Servlet 對象的時候，同時創建了 ServletConfig 對象
5.  ServletConfig 接口到底是幹什麼用的? 有什麼用呢?
    Config 是 Configuration 的縮寫
    ServletConfig 對象被翻譯為: Servlet 對象的配置訊息對象
    N 個 Servlet 對象就有 N 個配置訊息對象
6.  ServletConfig 對象到底包裝了什麼訊息?
    <servlet>
        <servlet-name>configTest</servlet-name>
        <servlet-class>com.bjpowernode.javaweb.servlet.ConfigTestServlet.ConfigTestServlet</servlet-class>
    </servlet>
    ServletConfig 對象中包裝的信息是: web.xml文件中<servlet></servlet>標籤的配置訊息
    Tomcat 解析 web.xml 文件中 <servlet></servlet> 標籤中的配置信息自動包裝到 ServletConfig 對象中
7.  ServletConfig 接口中有哪些方法?
    <servlet>
        <servlet-name>configTest</servlet-name>
        <servlet-class>com.bjpowernode.javaweb.servlet.ConfigTestServlet.ConfigTestServlet</servlet-class>
        <!-- 此處是可以配置一個 Servlet 對象的初始化訊息的 -->
        <init-param>
            <param-name>driver</param-name>
            <param-value>com.mysql.cj.jdbc.Driver</param-value>
        </init-param>
        <init-param>
            <param-name>url</param-name>
            <param-value>jdbc:mysql://localhost:3306/bjpowernode</param-value>
        </init-param>
        <init-param>
            <param-name>user</param-name>
            <param-value>root</param-value>
        </init-param>
        <init-param>
            <param-name>password</param-name>
            <param-value>root1234</param-value>
        </init-param>
        <!---->
    </servlet>
    以上 <servlet></serlvet> 標籤中的 <init-param></init-param> 是初始化參數，這個初始化參數訊息會自動被 Tomcat 封裝到 ServletConfig 對象當中
8.  ServletConfig 介面中有4個方法:
    第1個方法:
        public String getInitParameter(String name);
    第2個方法:
        public Enumeration<String> getInitParameterNames();
    第3個方法:
        public ServletContext getServletContext();
    第4個方法:
        public String getServletName();
    以上的4個方法，在自己編寫的 Servlet class 中亦可使用 this 去調用。(此 Servlet 繼承了 GenericServlet )

*/

public class ConfigTestServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // 獲取 ServletConfig 對象
        ServletConfig config = this.getServletConfig();
        // 輸出該對象
        // org.apache.catalina.core.StandardWrapperFacade@48b3350c
        out.print("ServletConfig 對象是: " + config.toString());
        out.print("<br>");

        // 獲取 <servlet-name></servlet-name>
        String servletName = config.getServletName();
        out.print("<servlet-name>" + servletName + "</servlet-name>");
        out.print("<br>");

        // 通過 ServletConfig 對象的兩個方法，可以獲取 web.xml 文件中的初始化參數配置訊息
        // java.util.Enumeration<java.lang.String> getInitParameterNames(): 獲取所有的初始化參數的 name
        Enumeration<String> initParameterNames = config.getInitParameterNames();
        // 遍歷集合
        while(initParameterNames.hasMoreElements()) {  // 是否有更多元素
            String parameterName = initParameterNames.nextElement();  // 取元素
            String parameterVal = config.getInitParameter(parameterName);  // 通過 name 獲取 value
            out.print(parameterName + "=" + parameterVal);
            out.print("<br>");
        }
        // java.lang.String getInitParameterZWSP(java.lang.String name)  通過初始化參數的 name 獲取 value
        /*
        String driver = config.getInitParameter("driver");
        out.print(driver);
        */

        // 實際上獲取一個 Servlet 對象的初始化參數，可以不用獲取 ServletConfig 對象，直接通過 this 也可以
        Enumeration<String> names = this.getInitParameterNames();
        while(names.hasMoreElements()) {
            String name = names.nextElement();
            String value = this.getInitParameter(name);
            // 打印到後台
            System.out.println(name + "=" + value);
        }

        // 如何獲取 ServletContext 對象?
        // 第一種方式: 通過 ServletConfig 對象獲取 ServletContext 對象
        ServletContext application = config.getServletContext();
        // 輸出
        out.print("<br>" + application);  // org.apache.catalina.core.ApplicationContextFacade@19187bbb

        // 第二種方式: 通過 this 也可以獲取 ServletContext 對象
        ServletContext application2 = this.getServletContext();
        out.print("<br>" + application2);    // org.apache.catalina.core.ApplicationContextFacade@19187bbb


    }

}
