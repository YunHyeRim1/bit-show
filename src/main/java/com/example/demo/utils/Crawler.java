package com.example.demo.utils;

import javax.swing.text.Document;

import com.example.demo.domains.ShowDto;

import org.jsoup.Jsoup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Crawler extends Proxy {
    @Autowired Printer printer;
    @Autowired ShowDto show;
    @Autowired Box<ShowDto> showBox;
    public Box<ShowDto> crawling(String url) {
        printer.accept("크롤링 대상 URL : "+url);



        return showBox;
    }
}
