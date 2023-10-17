package com.bjpowernode.problem.exp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

// 自定義異常類，讓 Spring MVC 的異常處理器使用
public class IsbnNotFoundException extends ErrorResponseException {

    public IsbnNotFoundException(HttpStatus httpStatus, String detail) {
        super(httpStatus, createProblemDetail(httpStatus, detail), null);
    }

    private static ProblemDetail createProblemDetail(HttpStatus httpStatus, String detail) {

        // 封裝 RFC7807 字段
        ProblemDetail problemDetail = ProblemDetail.forStatus(httpStatus);
        problemDetail.setType(URI.create("/api/probs/not-found"));
        problemDetail.setTitle("圖書異常");
        problemDetail.setDetail(detail);
        // 自定義字段
        problemDetail.setProperty("嚴重程度", "低");
        problemDetail.setProperty("客戶信箱", "service@bjpowernode.com");
        return problemDetail;

    }

}
