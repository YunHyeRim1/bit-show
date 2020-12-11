package com.example.demo.controllers;

import java.util.List;
import java.util.Map;

import com.example.demo.domains.ShowDto;
import com.example.demo.services.ShowService;
import com.example.demo.utils.Printer;
import com.example.demo.utils.Proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController {
    @Autowired Printer printer;
    @Autowired ShowService showService;
    @Autowired Proxy px;

    @PostMapping("/shows")
    public Map<?,?> write(@RequestBody ShowDto show) {
        var map = px.hashmap();
        map.put("message", px.message(showService.write(show)));
        return map;
    }
    @GetMapping("/shows/crawling/{site}")
    public Map<?,?> crawling(@PathVariable String site){
        var map = px.hashmap();

        return map;
    }
}