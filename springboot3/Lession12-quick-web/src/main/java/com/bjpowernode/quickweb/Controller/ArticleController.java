package com.bjpowernode.quickweb.Controller;

import com.bjpowernode.quickweb.vo.ArticleVO;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ArticleController {

    // 發布新文章
    /*
        @Validated：驗證 Bean
        BindingResult：獲取包含 Bean 的驗證結果
    */
    @PostMapping("/article/add")
    public Map<String, Object> addArticle(@Validated(ArticleVO.AddArticleGroup.class) @RequestBody ArticleVO articleVO, BindingResult br){

        // service 方法處理文章的業務

        // 返回結果數據
        Map<String, Object> map = new HashMap<>();
        if ( br.hasErrors() ){
            // 錯誤訊息集合
            List<FieldError> fieldErrors = br.getFieldErrors();
            for (int i = 0, len = fieldErrors.size(); i < len ; i++ ){
                 FieldError fieldError = fieldErrors.get(i);
                 map.put(i + "-" + fieldError.getField(), fieldError.getDefaultMessage());
            }
        }
        return map;
    }

    @PostMapping("/article/edit")
    public Map<String, Object> editArticle(@Validated(ArticleVO.EditArticleGroup.class) @RequestBody ArticleVO articleVO, BindingResult br){

        // service 方法處理文章的業務

        // 返回結果數據
        Map<String, Object> map = new HashMap<>();
        if ( br.hasErrors() ){
            // 錯誤訊息集合
            List<FieldError> fieldErrors = br.getFieldErrors();
            for (int i = 0, len = fieldErrors.size(); i < len ; i++ ){
                FieldError fieldError = fieldErrors.get(i);
                map.put(i + "-" + fieldError.getField(), fieldError.getDefaultMessage());
            }
        }
        return map;
    }

}
