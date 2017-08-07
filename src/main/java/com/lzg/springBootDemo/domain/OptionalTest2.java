package com.lzg.springBootDemo.domain;

import com.lzg.springBootDemo.domain.Company;
import com.lzg.springBootDemo.domain.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OptionalTest2 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("zhangsan");

        Employee employee2 = new Employee();
        employee2.setName("lisi");

        Company company = new Company();
        company.setName("company1");

        List<Employee> employeeList = Arrays.asList(employee, employee2);
        company.setEmployeeList(employeeList);

        // 下面的代码使用函数式的风格开发，避免了null判断以及条件分支等等代码
        Optional<Company> optional = Optional.ofNullable(company);
        System.out.println(optional.isPresent());
        System.out.println(optional.get().getEmployeeList());
        if (company.getEmployeeList()!=null)
        System.out.println(company.getEmployeeList());
        System.out.println(optional.map(theCompany -> theCompany.getEmployeeList()).orElse(Collections.emptyList()));
    }
}