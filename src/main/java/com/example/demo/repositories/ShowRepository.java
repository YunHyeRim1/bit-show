package com.example.demo.repositories;

import java.util.List;

import com.example.demo.domains.ShowDto;

import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository {

	public int insert(ShowDto show);

	public List<ShowDto> selectAll();
    
}
