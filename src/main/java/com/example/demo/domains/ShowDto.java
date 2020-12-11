package com.example.demo.domains;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data @Lazy
public class ShowDto {
    private String showNum, subTitle, title, period, time, venue, admission, price, host, management, inquiry;
}
