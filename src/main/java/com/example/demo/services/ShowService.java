package com.example.demo.services;

import java.util.List;

import com.example.demo.domains.ShowDto;

import org.springframework.stereotype.Component;

@Component
public interface ShowService {

    public int add(ShowDto show);
    
	public List<ShowDto> list();
	
	public int count();
	
    public ShowDto getShowById(String showNum);
    
	public int update(ShowDto show);
	
	public int delete(ShowDto show);

	public int crawling(String url);

}
