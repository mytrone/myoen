package com.example.demo.service;

import com.example.demo.dao.MyoneDao;
import com.example.demo.eity.Myone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyoneService {

    @Autowired
    MyoneDao myoneDao;

    public Myone save(Myone myone){
        return myoneDao.save(myone);
    }

}
