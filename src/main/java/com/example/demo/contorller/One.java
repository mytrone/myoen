package com.example.demo.contorller;

import com.example.demo.eity.Myone;
import com.example.demo.service.MyoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class One {
    @Autowired
    MyoneService myoneService;

    @GetMapping
    public Myone string(){
        Myone myone=new Myone(null,"都是");
        Myone save = myoneService.save(myone);
        return save;
    }
}
