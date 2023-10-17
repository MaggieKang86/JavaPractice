package com.bjpowernode.exp.handler;

import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    1.在類的上面加入 @ControllerAdvice, @RestControllerAdvice
      靈活組合 @ControllerAdvice 和 @ResponseBody
    2.在類中自定義方法，處理各種異常
      方法定義同 Controller 類中的方法的定義
*/

// 控制器增強，給 Controller 增加異常處理功能，類似 AOP 的思想
// @ControllerAdvice
public class GlobalExceptionHandler {

    // 定義方法處理數學異常
    /*
        @ExceptionHandler：指定處理異常的方法
            位置：在方法的上面
            屬性：是異常類的 class 數組，如果你的系統拋出的異常類型與 @ExceptionHandler 聲明的相同，由當前方法處理異常
    */
//    @ExceptionHandler({ArithmeticException.class})
//    public String handlerArithmeticException(ArithmeticException e, Model model) {
//        String error = e.getMessage();
//        model.addAttribute("error", error);
//        return "exp"; // 就是視圖
//    }

//    @ExceptionHandler({ArithmeticException.class})
//    @ResponseBody
//    public Map<String, String> handlerReturnDataException(ArithmeticException e) {
//        Map<String,String> error = new HashMap<>();
//        error.put("msg", e.getMessage());
//        error.put("tips", "被除數不能為0");
//        return error;
//    }

    // 處理 JSR303 驗證參數的異常
    @ResponseBody
    @ExceptionHandler({MethodArgumentNotValidException.class})
    // @ExceptionHandler({BindException.class})
    public Map<String, Object> handlerJSR303Exception(BindException e) { //MethodArgumentNotValidException
        System.out.println("======JSR303======");
        Map<String, Object> map = new HashMap<>();
        BindingResult result = e.getBindingResult();
        if (result.hasErrors()){
            List<FieldError> errors = result.getFieldErrors();
            for (int i = 0, len = errors.size(); i < len; i++){
                FieldError field = errors.get(i);
                map.put(i + "-" + field.getField(), field.getDefaultMessage());
            }
        }
        return map;
    }


}
