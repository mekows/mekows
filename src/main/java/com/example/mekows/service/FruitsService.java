package com.example.mekows.service;

import com.example.mekows.dao.FruitsDao;
import com.example.mekows.entity.Fruits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FruitsService {
    @Autowired
    private FruitsDao fruitsDao;

    public Fruits findOne(Long id){
        return fruitsDao.findOne(id);
    }

    public Fruits save(Fruits fruits){
        return  fruitsDao.save(fruits);
    }
}
