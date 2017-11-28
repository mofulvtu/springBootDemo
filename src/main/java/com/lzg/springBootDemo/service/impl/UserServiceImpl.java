package com.lzg.springBootDemo.service.impl;

import com.lzg.springBootDemo.dao.cluster.CityDao;
import com.lzg.springBootDemo.dao.master.UserDao;
import com.lzg.springBootDemo.domain.City;
import com.lzg.springBootDemo.domain.User;
import com.lzg.springBootDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户业务层
 * Created by Liuzg on 2017/9/13
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;//主数据源

    @Autowired
    private CityDao cityDao;//从数据源

    @Override
    public User findByName(String userName) {
        User user = userDao.findByName(userName);
        City city = cityDao.findById(1L);
        user.setCity(city);
        return user;
    }
}
