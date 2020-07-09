package com.community.service.impl;


import com.community.dao.HouseholdInfoRepository;
import com.community.dao.StaffInfoRepository;
import com.community.dao.UserRoleRepository;
import com.community.entity.po.Feedback;
import com.community.dao.FeedbackRepository;
import com.community.entity.vo.FeedbackVo;
import com.community.service.IFeedbackService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Chavy, Walter
 * @date 2020/05/02
 */
@Service
public class FeedbackServiceImpl implements IFeedbackService {

    @Resource
    private FeedbackRepository feedbackRepository;

    @Resource
    private UserRoleRepository userRoleRepository;

    @Resource
    private StaffInfoRepository staffInfoRepository;

    @Resource
    private HouseholdInfoRepository householdInfoRepository;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean addFeedback(Feedback feedback) {
        Assert.notNull(feedback, "反馈内容不能为空");
        Assert.notNull(feedback.getUserId(), "用户id不能为空");
        Assert.notNull(feedback.getType(), "反馈类型不能为空");
        Assert.notNull(feedback.getDetails(), "反馈内容不能为空");

        Integer role = userRoleRepository.selectRoleIdByUserId(feedback.getUserId());
        Assert.state(role != null && role == 2, "该用户不存在或不是住户");

//        Assert.state(feedbackRepository.insert(feedback) == 1, "增加失败");
        return true;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateFeedback(Feedback feedback) {
        Assert.notNull(feedback, "反馈内容不能为空");
        Assert.notNull(feedback.getId(), "主键id不能为空");

        if (feedback.getEmployeeId() != null) {
            Assert.state(staffInfoRepository.selectStaffExist(feedback.getEmployeeId()), "该用户不存在或不是工作人员");
        }

//        Assert.state(feedbackRepository.updateById(feedback) == 1, "更新失败");
        return true;
    }

    @Override
    public Page<FeedbackVo> getFeedback(Page<FeedbackVo> page) {
//        Page<Feedback> feedbackPage = new Page<>(page.getCurrent(), page.getSize());
//        feedbackPage = feedbackRepository.selectPage(feedbackPage, null);
//
//        List<FeedbackVo> feedbackVos = new LinkedList<>();
//        for(Feedback feedback : feedbackPage.getRecords()){
//            FeedbackVo feedbackVo = FeedbackVo.convert(feedback);
//
//            feedbackVo.setUserName(householdInfoRepository.selectByUserId(feedback.getUserId()).getName());
//
//            if(feedback.getEmployeeId() != null){
//                feedbackVo.setEmployeeName(staffInfoRepository.selectByUserId(feedback.getEmployeeId()).getName());
//            }
//            feedbackVos.add(feedbackVo);
//        }
//
//        page.setRecords(feedbackVos);
//        page.setTotal(feedbackPage.getTotal());
        return page;
    }
}
