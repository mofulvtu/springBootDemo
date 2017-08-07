package com.lzg.springBootDemo.domain;

import java.util.List;
/**
 * Desc:
 * @Author  Liuzeg
 * @Date  2017/8/7 14:57
 */
public class Company {
    private String name;
    private List<Employee> employeeList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}