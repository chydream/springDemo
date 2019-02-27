package com.example.demo.controller;


import com.example.demo.entity.Girl;
import com.example.demo.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;
    @RequestMapping(value = "/girls",method = RequestMethod.GET)
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }
}
