package com.example.ejb.controller;

import com.example.ejb.entity.BookDetail;
import com.example.ejb.service.BookDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/book")
public class BookDetailController {
    @Autowired
    private BookDetailService service;

    @GetMapping(value = "/search")
    public String index() {
        return "search";
    }

    @PostMapping
    public String process(@RequestParam("name") String name) {
        System.out.println(name);
        return "redirect:/book/detail/" + name;
    }

    @GetMapping(value = "/detail/{name}")
    public String getDetail(@PathVariable("name") String name, Model model) {
        BookDetail book = service.findByName(name);
        if(book == null){
            return "error";
        }
        model.addAttribute("book", book);
        return "detail";
    }

}
