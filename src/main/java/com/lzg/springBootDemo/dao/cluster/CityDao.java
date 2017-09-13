package com.lzg.springBootDemo.dao.cluster;

import com.lzg.springBootDemo.domain.City;

import java.util.List;

/**
 * Created by Liuzg on 2017/8/15
 */
public interface CityDao {

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

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCityById(Long id);
}
