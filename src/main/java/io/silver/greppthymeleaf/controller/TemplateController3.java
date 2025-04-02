package io.silver.greppthymeleaf.controller;

import io.silver.greppthymeleaf.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @GetMapping("/3")
    public String showLayoutPage3(Model model) {
        model.addAttribute("isLogin", true);
        return "/pages/layout_page_3";
    }

    @GetMapping("/4")
    public String showLayoutPage4(Model model) {
        model.addAttribute("isLogin", true);
        model.addAttribute("post", new Post(1L, "안녕하세요!", "관리자!", "반갑습니다!"));

        return "/pages/layout_page_4";
    }
}
