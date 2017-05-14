package service;

import mapper.ActivityMapper;
import org.springframework.stereotype.Service;
import pojo.Activity;

import javax.annotation.Resource;

/**
 * Created by wcd on 2017/5/14.
 */
@Service("activityService")
public class ActivityServiceImpl implements IActivityService {
    @Resource
    private ActivityMapper activityMapper;
    public Activity getActivityById(int id) {
        return activityMapper.selectById(id);
    }
}
