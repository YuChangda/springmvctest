package mapper;

import pojo.Activity;

import java.util.List;

/**
 * Created by wcd on 2017/5/12.
 */
public interface ActivityMapper {
    List<Activity> selectAll();
    Activity selectById(int id);
    void update(Activity activity);

    void insert(Activity activity);
}
