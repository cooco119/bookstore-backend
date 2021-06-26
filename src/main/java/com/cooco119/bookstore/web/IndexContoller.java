package com.cooco119.bookstore.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexContoller {

    @GetMapping("/")
    public String index() {
        return "hello world";
    }
}
