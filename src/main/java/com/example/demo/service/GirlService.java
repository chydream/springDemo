package com.example.demo.service;

import com.example.demo.entity.Girl;
import com.example.demo.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;
    public List<Girl> getGirlList(){
        return girlRepository.findAll();
    }
}
