package com.lzg.springBootDemo.service;

import com.lzg.springBootDemo.domain.User;

/**
 * Created by Liuzg on 2017/9/13
 */
public interface UserService {

    User findByName(String userName);
}
