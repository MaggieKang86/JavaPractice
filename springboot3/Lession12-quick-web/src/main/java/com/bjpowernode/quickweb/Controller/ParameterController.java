package com.bjpowernode.quickweb.Controller;

import com.bjpowernode.quickweb.vo.Person;
import com.bjpowernode.quickweb.vo.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;

@RestController
public class ParameterController {

    // 一一對應，適合接收簡單類型數據 String, int, long, double, float。適合接收參數數量少的情況，比如2,3
    // http://localhost:8080/p?name=lisi&age=20&sex=m
    @GetMapping("/param/p1")
    public String p1(String name, Integer age, String sex){
        return "接收參數：" + name + "," + age + "," + sex;
    }

    // 使用對象接收參數，要求對象的屬性名稱和請求中的參數名一樣，屬性有set方法，類有無參數構造方法
    @GetMapping("/param/p2")
    public String p2(Person person){
        person.getName();
        person.getAge();
        person.getSex();
        // XXXService(person.getName(), person.getSex())
        return "接收參數，使用對象" + person.toString();
    }

    // 使用 HttpServletRequest 接收參數
    @GetMapping("/param/p3")
    public String p3(HttpServletRequest request){
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String sex = request.getParameter("sex");
        return "name：" + name + ", age：" + age + ",sex：" + sex;
    }

    // 使用@RequestParam
    @GetMapping("/param/p4")
    public String p4(@RequestParam(value="name", required = true) String name,
                     @RequestParam(value = "age", required = false, defaultValue = "26") Integer age){
        return "p4, name = " + name + ", age = " + age;
    }

    // 使用@RequestHeader
    @GetMapping("/param/p5")
    public String p5(@RequestParam(value="name", required = true) String name,
                     @RequestParam(value = "age", required = false, defaultValue = "26") Integer age,
                     @RequestHeader("Accept") String accept){
        return "p5, name = " + name + ", age = " + age + ",accept = " + accept;
    }

    // 使用 @RequestBody 接收 json，post請求體數據
    /*
        前端數據：{"username":"lisi","age":"20"}
        @RequestBody: 從請求體中讀取 json 數據，將數據轉為型別參數對象的屬性值
                      框架創建 User 對象，將 username、age 的 key 值賦予給兩個同名的屬性
        前端請求中需要指定: 頭 Content-Type: application/json
    */
    @PostMapping("/param/json")
    public String p6(@RequestBody User user) {
        return "p6,json: " + user.toString();
    }

    // 使用 Reader、InputStream 讀取 post 請求體的數據
    @PostMapping("param/json2")
    public String p7(Reader reader) {
        StringBuffer content = new StringBuffer("");
        try(BufferedReader bin = new BufferedReader(reader)){
            var line = "";
            while((line = bin.readLine()) != null){
                content.append(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return "p7, reader = " + content.toString();
    }

    // 接收數組 多個值
    @GetMapping("/param/vals")
    public String getMultiVal(Integer [] id){
        List<Integer> ids = Arrays.stream(id).toList();
        return ids.toString();
    }

}
