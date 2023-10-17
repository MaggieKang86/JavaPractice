package com.bjpowernode.problem.habdler;

import com.bjpowernode.problem.exp.BookNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.ErrorResponse;
import org.springframework.web.ErrorResponseException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.URI;
import java.time.Instant;

// @RestControllerAdvice
public class GlobalExceptionHandler {

    // 定義的 ProblemDetail
/*    @ExceptionHandler({BookNotFoundException.class})
    public ProblemDetail handlerBookNotFoundException(BookNotFoundException e) {
        // ProblemDetail
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
        // type: 異常類型，是一個 uri，uri 找到解決問題的途徑
        problemDetail.setType(URI.create("/api/probs/not-found"));
        problemDetail.setTitle("圖書異常");

        // 增加自定義的字段
        problemDetail.setProperty("時間", Instant.now());
        problemDetail.setProperty("克服", "service@bjpowernode.com");
        // ....
        return problemDetail;
    }
*/

    // 返回 ErrorResponse
    @ExceptionHandler({BookNotFoundException.class})
    public ErrorResponse handlerException(BookNotFoundException e) {
        ErrorResponse error = new ErrorResponseException(HttpStatus.NOT_FOUND, e);
        return error;
    }


}
