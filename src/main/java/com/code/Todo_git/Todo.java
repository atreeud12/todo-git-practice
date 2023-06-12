package com.code.Todo_git;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Todo {

    @GetMapping("/")
    public String todo() {
        return "To-do App on dev to main second commit!";
    }
}
