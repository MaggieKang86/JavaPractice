package com.bjpowernode.quickweb.Controller;

import com.bjpowernode.quickweb.vo.RoleVO;
import com.bjpowernode.quickweb.vo.User;
import jdk.jfr.ContentType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/*
    @Controller：創建控制器(處理器)對象，控制器能夠接收請求，響應結果給瀏覽器
*/
@Controller
public class QuickController {

    // 定義方法處理請求，方法叫做控制器方法(處理器方法)
    // Model表示模型，儲存數據。這個數據最後是放在request作用域
    // HttpServletRequest 放在他的作用域中

    @RequestMapping("/exam/quick")
    public String quick(Model model){
        // 調用Service，處理請求，獲取數據
        model.addAttribute("title", "Web開發");
        model.addAttribute("time", LocalDateTime.now());
        // request.setAttribute("title", "Web開發")
        // 指定視圖，顯示數據
        return "quick"; // 他是視圖的文件名稱
    }

    @GetMapping("/hello")
    public ModelAndView hello() {
        // ModelAndView 表示數據和視圖
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", "李四");
        mv.addObject("age", 20);
        mv.setViewName("hello");
        return mv;
    }

    @GetMapping(value = "/json", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public User returnJson(){
        User user = new User();
        user.setUsername("zhangsan");
        user.setAge(20);

        RoleVO roleVO = new RoleVO();
        roleVO.setRoleName("管理員");
        roleVO.setMemo("具有較高的權限");
        roleVO.setId(11);
        user.setRoleVO(roleVO);

        return user;
    }

    @GetMapping(value = "/json3", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public ResponseEntity<User> returnEntity(){
        User user = new User();
        user.setUsername("zhangsan");
        user.setAge(20);

        RoleVO roleVO = new RoleVO();
        roleVO.setRoleName("管理員");
        roleVO.setMemo("具有較高的權限");
        roleVO.setId(11);
        user.setRoleVO(roleVO);

        ResponseEntity<User> response = new ResponseEntity<>(user, HttpStatus.OK);
        return response;
    }

    @GetMapping("/map")
    @ResponseBody
    public Map<String, Object> returnMap(){
        Map<String, Object> map = new HashMap<>();
        map.put("name", "lisi");
        map.put("age", 25);
        return map;
    }

    // 接收時間
    @GetMapping("/param/date")
    @ResponseBody
    public String paramDate(LocalDateTime date) {
        return "時間：" + date;
    }


}
