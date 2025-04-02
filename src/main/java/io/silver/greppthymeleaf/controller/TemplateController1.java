package io.silver.greppthymeleaf.controller;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class TemplateController1 {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/page1")
    public String showPage1(Model model) {
        model.addAttribute("msg", "대체된 메세지!");
        return "page1";
    }

    @GetMapping("/page2")
    public String showPage2(@ModelAttribute Article article, Model model) {
        // @ModelAttribute가 붙으면 빈으로 등록된다.
        model.addAttribute("article", article);

        return "page2";
    }

    @Data
    public class Article {
        private int id;
        private String title;
    }

    @GetMapping("/page3")
    public String showPage3(Model model) {

        String unsafeString = "<script>alert('메롱');</script>";

        model.addAttribute("script", unsafeString);

        return "page3";
    }

    @GetMapping("/page4")
    public String showPage4(Model model) {

        model.addAttribute("cellPhone", "iphone11");
        model.addAttribute("countryCallingCode", "+82");

        return "page4";
    }




}
