package com.bjpowernode.quickweb.Controller;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.apache.catalina.util.RequestUtil;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.OutputStream;
import java.io.Reader;
import java.util.Map;

@RestController
public class ExamPathController {

    // 使用「？」表示單個字符
    @GetMapping("/file/t?st.html")
    public String path1(HttpServletRequest request){
        return "path請求：" + request.getRequestURI();
    }

    //「*」表示0或多個字符，其中不可含有「/」路徑
    @GetMapping("/images/*.gif")
    public String path2(HttpServletRequest request){
        return "path2請求：" + request.getRequestURI();
    }

    //「**」表示所有：多個路徑或字符
    @GetMapping("/pic/**")
    public String path3(HttpServletRequest request){
        return "path3：" + request.getRequestURI();
    }

    // 路徑變量{*變量名稱}
    @GetMapping("/order/{*id}")
    public String path4(@PathVariable("id") String orderId, HttpServletRequest request){
        return "path4：" + request.getRequestURI() + ", id" + orderId;
    }

    // 正則表達式
    @GetMapping("/pages/{fname:\\w+}.log")
    public String path5(@PathVariable("fname") String fname, HttpServletRequest request) {
        return "path5請求：" + request.getRequestURI() + ", fname" + fname;
    }

    @GetMapping("/paths/get")
    public String path6(HttpServletRequest request){
        return "path6請求：" + request.getRequestURI();
    }

    public String req(ServletRequest request, ServletResponse response, HttpSession session,
                      Reader reader, OutputStream outputStream, @RequestParam("age") Integer age,
                      @RequestHeader("Accept") String accept, Map map, Model model, Integer id, String time){
        String requestId = request.getRequestId();
        response.setBufferSize(1024);
        session.setAttribute("name", "lisi");
        return "ok";
    }

}
