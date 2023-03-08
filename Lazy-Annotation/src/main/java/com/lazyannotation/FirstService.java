package com.lazyannotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class FirstService {

    private SecondService secondService;

    public FirstService(SecondService secondService) {
        this.secondService = secondService;
    }
}
