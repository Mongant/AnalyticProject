package com.mongant.analytics.controller;

import com.mongant.analytics.dao.DeveloperSalaryDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnalyticController {

    @Autowired
    DeveloperSalaryDaoImpl developerSalaryDao;

    @GetMapping(value = "/")
    public String controller() {
        System.out.println("Hello!");
        return "analytic";
    }
}
