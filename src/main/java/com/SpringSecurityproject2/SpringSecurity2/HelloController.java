package com.SpringSecurityproject2.SpringSecurity2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("Hello")

        public String printHello()
        {
            return "HelloWorld";
        }
    }

