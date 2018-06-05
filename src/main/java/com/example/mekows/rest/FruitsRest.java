package com.example.mekows.rest;

import com.example.mekows.dao.FruitsDao;
import com.example.mekows.entity.Fruits;
import com.example.mekows.service.FruitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/fruits")
@EnableAutoConfiguration
public class FruitsRest {
    @Autowired
    private FruitsService fruitsService;

    @RequestMapping("getFruitsById")
    @ResponseBody
    public Fruits getFruitsById(Long id) {
        Fruits fruits = fruitsService.findOne(id);
        System.out.println("userRepository: " + fruitsService);
        System.out.println("id: " + id);
        return fruits;
    }

    @RequestMapping("saveFruits")
    @ResponseBody
    public void saveFruits() {//注意 @RequestMapping("saveFruits")里的value值要与方法名称一致，否则找不到
        Fruits fruitsEntity = new Fruits();
        fruitsEntity.setName("苹果");
        fruitsEntity.setPrice(10.9f);
        fruitsService.save(fruitsEntity);
    }
}
