package com.example.demo.controllers;

import com.example.demo.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {

    @Autowired
    SearchService searchService;


    @GetMapping("/search")
    public String search(@RequestParam(value = "q", required = false, defaultValue = "New York") String query,
            Model model){

        model.addAttribute("searchResults", searchService.getSearchResults(query));

        return "searchScreen";
    }




}
