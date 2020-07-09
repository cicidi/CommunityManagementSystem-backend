package com.community.service.impl;

import com.community.dao.StaffInfoRepository;
import com.community.dao.UserRepository;
import com.community.entity.po.StaffInfo;
import com.community.service.IStaffInfoService;
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
public class StaffInfoServiceImpl implements IStaffInfoService {

    @Resource
    private StaffInfoRepository staffInfoRepository;

    @Resource
    private UserRepository userRepository;

    @Override
    public List<StaffInfo> getStaffInfo(Long userId) {
//        QueryWrapper<StaffInfo> queryWrapper = new QueryWrapper<>();
//        if (userId != null) {
//            Assert.notNull(userRepository.selectById(userId), "该用户不存在");
//
//            queryWrapper.eq(StaffInfo.USER_ID, userId);
//        }
//
//        return staffInfoRepository.selectList(queryWrapper);
        return null;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateStaffInfo(StaffInfo staffInfo) {
        Assert.notNull(staffInfo, "更新内容不能为空");
        Assert.notNull(staffInfo.getId(), "id不能为空");

//        Assert.state(staffInfoRepository.updateById(staffInfo) == 1, "更新失败");
        return true;
    }
}
