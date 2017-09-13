package com.lzg.springBootDemo.dao.master;

import com.lzg.springBootDemo.domain.User;

/**
 * Created by Liuzg on 2017/9/13
 */
public interface UserDao {

    User findByName(String userName);
}
