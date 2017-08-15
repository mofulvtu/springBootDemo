package com.lzg.springBootDemo.service.impl;

import com.lzg.springBootDemo.dao.CityDao;
import com.lzg.springBootDemo.domain.City;
import com.lzg.springBootDemo.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 城市业务逻辑实现类
 * Created by 刘增刚 on 2017/8/15
 */
@Service
public class CityserviceImpl implements CityService{

    @Resource
    private CityDao cityDao;

    @Override
    public List<City> findAllCity() {
        return cityDao.findAllCity();
    }

    @Override
    public City findById(Long id) {
        return cityDao.findById(id);
    }

    @Override
    public Long saveCity(City city) {
        return cityDao.saveCity(city);
    }

    @Override
    public Long updateCity(City city) {
        return cityDao.updateCity(city);
    }

    @Override
    public Long deleteCityById(Long id) {
        return cityDao.deleteCityById(id);
    }
}
