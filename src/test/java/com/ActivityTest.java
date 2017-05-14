package com;

import mapper.ActivityMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pojo.Activity;

import java.io.IOException;
import java.io.Reader;
import java.util.Date;
import java.util.List;

/**
 * Created by wcd on 2017/5/12.
 */
public class ActivityTest {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;
    @Before
    public void up(){
        try {
            reader = Resources.getResourceAsReader("mybatis_config.xml");
            sqlSessionFactory =new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test(){
        SqlSession sqlSession =sqlSessionFactory.openSession();
        ActivityMapper activityMapper =sqlSession.getMapper(ActivityMapper.class);
        Activity activity =activityMapper.selectById(10);
        Assert.assertEquals("查找不成功", "爱美丽", activity.getTitle());
        List<Activity> list =activityMapper.selectAll();
        System.out.println(list);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void update(){
        SqlSession session = sqlSessionFactory.openSession();
        ActivityMapper activityMapper = session.getMapper(ActivityMapper.class);
        Activity activity = activityMapper.selectById(10);
        activity.setImgPath("local/3306");
        activity.setTitle("爱打游戏");
        activity.setNote("爱打游戏");
        activity.setStartTime(new Date());
        activity.setEndTime(new Date());
        activityMapper.update(activity);
        session.commit();
        session.close();
    }
    @Test
    public void insert(){
        SqlSession session = sqlSessionFactory.openSession();
        ActivityMapper activityMapper = session.getMapper(ActivityMapper.class);
        Activity activity = new Activity();
        activity.setTitle("耐克大促销");
        activity.setNote("耐克大促销");
        activity.setImgPath("www.zhq.com/91");
        activity.setStartTime(new Date());
        activity.setEndTime(new Date());
        activityMapper.insert(activity);;
        session.commit();
        session.close();
    }

}
