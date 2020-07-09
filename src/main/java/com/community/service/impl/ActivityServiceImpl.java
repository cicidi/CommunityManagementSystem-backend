package com.community.service.impl;

import com.community.dao.ActivityRepository;
import com.community.entity.po.Activity;
import com.community.service.IActivityService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Chavy, Walter
 * @date 2020/05/02
 */
@Service
public class ActivityServiceImpl implements IActivityService {

    @Resource
    private ActivityRepository activityRepository;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteCommunityActivity(List<Long> activityIds) {
        Assert.notNull(activityIds, "id列表不能为空");
        Assert.state(!activityIds.isEmpty(), "id列表不能为空");
//        TBD
//        Assert.state(activityRepository.deleteAll(activityIds), "删除失败");
        return true;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateCommunityActivity(Activity activity) {
        Assert.notNull(activity, "更新信息不能为空");
        Assert.notNull(activity.getId(), "主键不能为空");

        Assert.state(activityRepository.save(activity) == null, "更新失败");
        return true;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean addCommunityActivity(Activity activity) {
        Assert.notNull(activity, "活动不能为空");
        Assert.notNull(activity.getActivityName(), "活动名不能为空");
        Assert.notNull(activity.getContent(), "活动内容不能为空");
        Assert.notNull(activity.getPrincipal(), "负责人不能为空");
        Assert.notNull(activity.getHost(), "主办方不能为空");
        Assert.notNull(activity.getTelNumber(), "咨询电话不能为空");

        Assert.state(activityRepository.save(activity) == null, "增加失败");
        return true;
    }

    @Override
    public Page<Activity> getCommunityActivity(Page<Activity> page) {
        //TBD
//        page = activityRepository.selectPage(page, null);
        return page;
    }
}
