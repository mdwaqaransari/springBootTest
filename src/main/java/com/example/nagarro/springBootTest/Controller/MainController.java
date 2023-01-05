package com.example.nagarro.springBootTest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

    @GetMapping("/test")
    public String test(){
        return "Rest API is working successfully!.........";
    }

    @GetMapping("/list")
    public List getNumbers(){
        List<String> arrayList = List.of("one","two", "three", "four", "five");
        return arrayList;
    }
}
