package com.example.demo.services;

import java.util.List;

import com.example.demo.domains.ShowDto;

import org.springframework.stereotype.Component;

@Component
public interface ShowService {

    public int write(ShowDto show);
    
	public List<ShowDto> list();

}
