package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.Activity;
import service.IActivityService;

import javax.annotation.Resource;

/**
 * Created by wcd on 2017/5/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestMybatis {
    @Resource
    private IActivityService activityService;
    @Test
    public void test1(){
        Activity activity =activityService.getActivityById(11);
        System.out.println(activity);
    }
}
