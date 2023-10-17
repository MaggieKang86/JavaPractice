SpringMVC（Model、View、Controller）
一、控制器
    1.有 @Controller、@RestController 註解的類叫做控制器，項目中控制器有很多
      一般相關的業務是一個控制器，譬如訂單的處理工作，訂單的控制 OrderController,

    2.@Controller、@RestController區別
      @RestController：包含了 @Controller 的功能，同時加入了 @ResponseBody 的註解。
                       表示當前控制器類中的所有方法，都會默認加入 @ResponseBody 的功能，
                       方法的返回值是數據，可以通過 HttpServletResponse 輸出給瀏覽器，請求方法。
      @Controller：含有 @Component 的功能，控制器類對象是 Spring 容器管理的
    3.定制控制器方法
      (1)方法上面的 @RequestMapping(value="請求的uri地址")：表示這個 uri 的請求由當前方法處理
         擁有相同功能的：@GetMapping、@PostMapping、@PutMapping、@DeleteMapping
      (2)控制器方法的形參：接收請求的參數，多種方法接收參數
      (3)控制器方法的返回值：表示應答結果，給請求的結果(數據、視圖)

Spring MVC 處理請求，圍繞著控制器的方法
    1.public 方法
    2.方法名稱自定義
    3.方法的形參表示接收的請求參數
      (1)逐一按名稱對應接收參數。 String name, Integer age
      (2)使用自定義對象，接收多個參數。User(name, age, sex)
      (3)接收 json，使用 @RequestBody 註解，加上自定義對象
      (4)使用 Reader、InputStream 作為參數，讀取 post 請求體的內容
      (5)使用 HttpServletRequest 作為參數，調用 getParameter() 方法接收參數
      (6)數組參數 Integer [] id
      (7)@RequestParam
      (8)@requestHeader
    4.控制器方法的返回值，表示給請求方的應答，響應內容
      (1)String 表示視圖頁面（xxx.html），沒有使用 @ResponseBody
      (2)ModelAndView：是數據和視圖結合體，包含了數據和視圖
      (3)自定義對象：默認將自定義對象轉為 json 格式，輸出給瀏覽器
      (4)ResponseEntity：包含數據和自定義的 HttpStatus Code
      (5)Map：默認將 key 和 value 轉為 json 字符串

==============================================================================

測試請求：使用瀏覽器，PostMan、ApiFox、IDEA 中的 HttpClient

==============================================================================

Spring MVC 自動配置：
    DispatcherServletAutoConfiguration：配置中央調度器，設置其名稱。 load-on-start:-1, 默認 url-pattern: /
    WebMvcConfigurationSupport：配置 Spring MVC 的支持對象。HandlerMapping、HandlerAdapter、ViewResolver、HandlerExceptionResolver、
                                                         HttpMessageConverters .. 靜態資源的對象
    ServletWebServerFactoryAutoConfiguration：配置 Tomcat 服務器、Jetty 服務器

核心對象：
    DispatcherServlet：Servlet，使用 doService() 接收並處理請求，前端控制器

處理業務：
    後端控制器，開發人員自定義的 Controller，使用註解 @Controller、@RestController

幫助處理請求的對象：
    HandlerMapping：根據請求的 uri 地址，找到處理此請求的 Controller 對象（Spring容器中的）
    HandlerAdapter：使用適配器模式，調用執行具體的控制器方法
    ViewResolver：處理視圖，創建視圖對象 View
    HandlerExceptionResolver：異常處理器，處理請求中的異常

註解：
    (1)控制器 @Controller、@RestController
    (2)接收請求 @RequestMapping、@GetMapping、@PostMapping、@PutMapping、@DeleteMapping
    (3)接收參數 @RequestParam、@RequestHeader、@RequestBody
    (4)校驗參數 @Validated、JSR 303 註解
    (5)返回值表示數據的 @ResponseBody
    (6)支持 RESTful 的路徑變量 @PathVariable




