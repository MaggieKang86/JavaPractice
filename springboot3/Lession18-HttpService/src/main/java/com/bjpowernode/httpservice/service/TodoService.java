package com.bjpowernode.httpservice.service;

import com.bjpowernode.httpservice.model.Todo;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;


public interface TodoService {

    // 一個方法就是一個遠程服務（遠程調用）
    // 查詢某 ID 對應的 Todo
    @GetExchange("/todos/{id}")
    Todo getTodoById(@PathVariable("id") Integer id);

    @PostExchange(value = "/todos/", accept = MediaType.APPLICATION_JSON_VALUE)
    Todo createTodo(@RequestBody Todo newTodo);

    // 修改資源
    @PutExchange("/todos/1")
    ResponseEntity<Todo> modifyTodo(@PathVariable Integer id, @RequestBody Todo todo);
}
