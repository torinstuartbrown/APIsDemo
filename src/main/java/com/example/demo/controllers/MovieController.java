package com.example.demo.controllers;

import com.example.demo.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/reviews")
    public String home(Model model){
        model.addAttribute("reviewList",movieService.getReviews());
        return "reviewIndex";
    }
}
