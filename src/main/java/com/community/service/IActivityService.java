package com.community.service;

import com.community.entity.po.Activity;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author Chavy, Walter
 * @date 2020/05/02
 */
public interface IActivityService extends IService<Activity> {

    /**
     * 批量删除社区活动
     *
     * @param activityIds 社区活动ids
     * @return boolean
     */
    boolean deleteCommunityActivity(List<Long> activityIds);

    /**
     * 更新活动信息
     *
     * @param activity 活动
     * @return boolean
     */
    boolean updateCommunityActivity(Activity activity);

    /**
     * 增加社区活动
     *
     * @param activity 活动
     * @return boolean
     */
    boolean addCommunityActivity(Activity activity);

    /**
     * 分页查询社区活动
     *
     * @param page 分页bean
     * @return Page<Activity>
     */
    Page<Activity> getCommunityActivity(Page<Activity> page);

}
