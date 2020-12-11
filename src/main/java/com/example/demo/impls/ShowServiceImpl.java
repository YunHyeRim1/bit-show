package com.example.demo.impls;

import java.util.List;

import com.example.demo.domains.ShowDto;
import com.example.demo.repositories.ShowRepository;
import com.example.demo.services.ShowService;
import com.example.demo.utils.Box;
import com.example.demo.utils.Crawler;
import com.example.demo.utils.Printer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowServiceImpl implements ShowService {
    @Autowired ShowRepository showRepository;
    @Autowired Printer printer;
    @Autowired ShowDto show;
    @Autowired Crawler crawler;
    

    @Override
    public int add(ShowDto show) {
        printer.accept("서비스로 전송된 데이터: "+show.toString());
        return showRepository.insert(show);
    }

    @Override
    public List<ShowDto> list() {
        return showRepository.selectAll();
    }
    
    @Override
    public int count() {
        return showRepository.count();
    }
    
    @Override
    public ShowDto getShowById(String showNum) {
        return showRepository.selectById(showNum);
    }
    
    @Override
    public int update(ShowDto show) {
        return showRepository.update(show);
    }
    
    @Override
    public int delete(ShowDto show) {
        return showRepository.delete(show);
    }
    
    @Override
    public int crawling(String url) {
        var showBox = new Box<ShowDto>();
        showBox = crawler.crawling(url);
        System.out.println("box size: "+showBox.size());
        for(int i = 0; i < showBox.size(); i++) {
            show = new ShowDto();
            show = showBox.get(i);
            System.out.println("Show: "+show.toString());
            add(showBox.get(i));
        }
        return count();
    }
}

