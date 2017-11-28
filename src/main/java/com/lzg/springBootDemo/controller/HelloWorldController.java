package com.lzg.springBootDemo.controller;

import com.lzg.springBootDemo.domain.Company;
import com.lzg.springBootDemo.domain.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Liuzg on 2017/8/7
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
    @RequestMapping("/index")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/getCompany")
    public Company getCompany(@RequestParam(value = "name1",required = false) String name1,@RequestParam(value = "name2",required = false) String name2){
        Company company = new Company();
        company.setName("小刘子");
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        employee1.setName(name1);
        employee2.setName(name2);
        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        company.setEmployeeList(list);

        return company;
    }
}
