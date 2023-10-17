package com.bjpowernode.quickweb.Controller;

import com.bjpowernode.quickweb.vo.User;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class JSONViewController {

    // 顯示json視圖，包含json數據
    @RequestMapping("/exam/json")
    public void responseJson(HttpServletResponse response) throws IOException {
        String json="{\"name\":\"lisi\", \"age\":20}";
        // 應答，通過HttpServletResponse輸出
        response.setContentType("application/json;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println(json);
        out.flush();
        out.close();
    }

    // SpringMVC支持控制器方法返回對象，由框架將對象使用jackson轉為json並輸出
    /*
        接受請求的註解
        @GetMapping: 接收get請求，簡化的@RequestMapping(method=RequestMethod.GET)
        @PostMapping: 接收post請求
        @PutMapping: 接收put請求
        @DeleteMapping: 接收delete請求
    */
    // @RequestMapping("/exam/json2")
    @GetMapping("/exam/json2")
    // @ResponseBody 上面 @Controller 已默認加入 @ResponseBody
    public User getUserJson() {
        User user = new User();
        user.setUsername("張三");
        user.setAge(22);
        return user;
    }


}
