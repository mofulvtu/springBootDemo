package com.lzg.springBootDemo.controller;

import com.lzg.springBootDemo.domain.City;
import com.lzg.springBootDemo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 *
 * Created by 刘增刚 on 2017/8/30
 * a.这里不是走 HTTP + JSON 模式，使用了 @Controller 而不是先前的 @RestController
 * b.方法返回值是 String 类型，和 application.properties 配置的 Freemarker 文件配置路径下的各个 *.ftl 文件名一致。
 *   这样才会准确地把数据渲染到 ftl 文件里面进行展示。
 * c.用 Model 类，向 Model 加入数据，并指定在该数据在 Freemarker 取值指定的名称。
 */
@Controller
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "api/city",method = RequestMethod.GET)
    public String findAllCity(Model model){
        List<City> cityList = cityService.findAllCity();
        model.addAttribute("cityList",cityList);
        return "cityList";
    }

    @RequestMapping(value = "api/city/{id}",method = RequestMethod.GET)
    public String findById(@PathVariable(value = "id")Long id,Model model){
        City city = cityService.findById(id);
        model.addAttribute("city",city);
        return "city";
    }
}
