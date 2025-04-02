package io.silver.greppthymeleaf.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class TemplateController2 {

    @GetMapping("/1")
    public String syntaxPage1(String username, Model model) {
        //localhost:8080/page/1
        model.addAttribute("username", username);
        return "/syntax/page1";
    }

    @GetMapping("/2")
    public String syntaxPage2(Model model) {

        List<String> shoppingList = Arrays.asList("양파", "감자", "당근", "설탕");
        model.addAttribute("shoppingList", shoppingList);

        return "/syntax/page2";
    }
}
