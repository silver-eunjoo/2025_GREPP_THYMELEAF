package io.silver.greppthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/layouts/pages")
public class TemplateController3 {
    //localhost:8080/layouts/pages

    @GetMapping("/1")
    public String showLayoutPage1() {
        return "/pages/layout_page_1";
    }

    @GetMapping("/2")
    public String showLayoutPage2() {
        return "/pages/layout_page_2";
    }
}
