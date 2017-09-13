package com.lzg.springBootDemo.controller;

import com.lzg.springBootDemo.domain.User;
import com.lzg.springBootDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 城市 Controller 实现 Restful HTTP 服务
 * Created by Liuzg on 2017/8/15
 */
@RestController
public class CityRestController {

//    @Autowired
//    private CityService cityService;
//
//    @RequestMapping(value = "api/city",method = RequestMethod.GET)
//    public List<City> findAllCity(){
//         return cityService.findAllCity();
//    }
//
//    @RequestMapping(value = "api/city/{id}",method = RequestMethod.GET)
//    public City findById(@PathVariable(value = "id")Long id){
//        return cityService.findById(id);
//    }

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/api/user",method = RequestMethod.GET)
    public User findByName(@RequestParam(value = "userName",required = true) String userName){
        return userService.findByName(userName);
    }
}
