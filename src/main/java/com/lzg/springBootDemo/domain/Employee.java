package com.lzg.springBootDemo.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Desc:
 * @Author  Liuzeg
 * @Date  2017/8/7 14:58
 */

/**
 * 通过 @ConfigurationProperties(prefix = “employ”) 注解，将配置文件中以 employ 前缀的属性值自动绑定到对应的字段中。
 * 同时用 @Component 作为 Bean 注入到 Spring 容器中。
 */
@Component
@ConfigurationProperties(prefix = "employ")
public class Employee {
    private String name;

    private String age;

    private String desc;

    private String uuid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", desc='" + desc + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}



