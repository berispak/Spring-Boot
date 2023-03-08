package com.scopeannotation.scopeannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstController {
    @Autowired
    private MyComponent myComponent;

    @GetMapping("/first-controller")
    private String getNameOfComponent(){
        return this.myComponent.getName();
    }

}
