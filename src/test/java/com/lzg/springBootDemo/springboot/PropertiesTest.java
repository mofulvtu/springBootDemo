package com.lzg.springBootDemo.springboot;


import com.lzg.springBootDemo.domain.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Created by 刘增刚 on 2017/8/14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesTest.class);

    @Autowired
    private Employee employee;

    @Test
    public void getEmployee(){
        LOGGER.info("\n\n"+employee.toString()+"\n");
    }
}
