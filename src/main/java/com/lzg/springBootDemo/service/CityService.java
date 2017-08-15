package com.lzg.springBootDemo.service;

import com.lzg.springBootDemo.domain.City;

import java.util.List;

/**
 * Created by 刘增刚 on 2017/8/15
 */
public interface CityService {

    /**
     * 获取城市列表
     * @return
     */
    List<City> findAllCity();

    /**
     * 根据城市id获取具体信息
     * @param id
     * @return
     */
    City findById(Long id);

    /**
     * 新增城市
     * @param city
     * @return
     */
    Long saveCity(City city);

    /**
     * 更新城市信息
     * @param city
     * @return
     */
    Long updateCity(City city);

    /**
     * 根据城市id删除对应城市信息
     * @param id
     * @return
     */
    Long deleteCityById(Long id);
}
