package com.lzg.springBootDemo.utils.interceptor;

import com.lzg.springBootDemo.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Access Token拦截器
 * Created by 刘增刚 on 2017/8/25
 */

@Component
public class AccessTokenVerifyInterceptor extends HandlerInterceptorAdapter {


    @Autowired
    CityService cityService;

    private final static Logger LOG = LoggerFactory.getLogger(AccessTokenVerifyInterceptor.class);

    /**
     * 第一步：从request获取token

     * 第二步：根据token获取校验对象信息（也可以加入过期时间校验，简单）

     * 第三步：通过校验信息获取用户信息
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        LOG.debug("AccessTokenVerifyInterceptor executing.......");
        boolean flag = false;

        //accesstoken参数
        String accessToken = request.getParameter("accesstoken");
        if (StringUtils.isEmpty(accessToken)){
            //验证accessToken
//            City city = cityService.ver
        }

        return flag;
    }
}
