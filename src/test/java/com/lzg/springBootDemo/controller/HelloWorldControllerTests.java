package com.lzg.springBootDemo.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Created by 刘增刚 on 2017/8/10
 */

/**
 * RunWith(SpringJUnit4ClassRunner.class): 表示使用Spring Test组件进行单元测试;
 * WebAppConfiguration: 使用这个Annotate会在跑单元测试的时候真实的启一个web服务，
 *                      然后开始调用Controller的Rest API，待单元测试跑完之后再将web服务停掉;
 * ContextConfiguration: 指定Bean的配置文件信息
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MockServletContext.class)
@WebAppConfiguration
public class HelloWorldControllerTests {

    private MockMvc mvc;


    @Before
    public void setUp() throws Exception{
        mvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
    }

    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

    @Test
    public void getCompany() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/getCompany").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }


    /**
     * Spring测试框架提供MockMvc对象，可以在不需要客户端-服务端请求的情况下进行MVC测试，
     * 完全在服务端这边就可以执行Controller的请求，跟启动了测试服务器一样。
     *
     * 测试开始之前需要建立测试环境，setup方法被@Before修饰。
     * 通过MockMvcBuilders工具，使用WebApplicationContext对象作为参数，创建一个MockMvc对象。
     *
     *  MockMvc对象提供一组工具函数用来执行assert判断，都是针对web请求的判断。
     * 1、mockMvc.perform执行一个请求；
     * 2、MockMvcRequestBuilders.get("/user/1")构造一个请求
     * 3、ResultActions.andExpect添加执行完成后的断言
     * 4、ResultActions.andDo添加一个结果处理器，表示要对结果做点什么事情，
     *    比如此处使用MockMvcResultHandlers.print()输出整个响应结果信息。
     * 5、ResultActions.andReturn表示执行完成后返回相应的结果。
     *
     * @throws Exception
     */
    @Test
    public void getAllCategoryTest() throws Exception {
        String responseString = mvc.perform(MockMvcRequestBuilders.get("/getCompany")    //请求的url,请求的方法是get
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)  //数据格式
                .param("name1", "456").param("name2", "123")         //添加参数
        ).andExpect(MockMvcResultMatchers.status().isOk())    //返回的状态是200
                .andDo(MockMvcResultHandlers.print())         //打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
        System.out.println("--------返回的json = " + responseString);
    }


}

