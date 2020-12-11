package com.example.demo.impls;

import java.util.List;

import com.example.demo.domains.ShowDto;
import com.example.demo.repositories.ShowRepository;
import com.example.demo.services.ShowService;
import com.example.demo.utils.Printer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowServiceImpl implements ShowService {
    @Autowired ShowRepository showRepository;
    @Autowired Printer printer;
    @Autowired ShowDto show;

    @Override
    public int write(ShowDto show) {
        
        return showRepository.insert(show);
    }

    @Override
    public List<ShowDto> list() {
        return showRepository.selectAll();
    }
}
