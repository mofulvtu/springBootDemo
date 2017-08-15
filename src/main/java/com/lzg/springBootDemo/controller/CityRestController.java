package com.lzg.springBootDemo.controller;

import com.lzg.springBootDemo.domain.City;
import com.lzg.springBootDemo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 城市 Controller 实现 Restful HTTP 服务
 * Created by 刘增刚 on 2017/8/15
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "api/city",method = RequestMethod.GET)
    public List<City> findAllCity(){
         return cityService.findAllCity();
    }

    @RequestMapping(value = "api/city/{id}",method = RequestMethod.GET)
    public City findById(@PathVariable(value = "id")Long id){
        return cityService.findById(id);
    }
}
