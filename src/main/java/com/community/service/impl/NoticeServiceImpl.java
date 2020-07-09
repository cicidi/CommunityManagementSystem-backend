package com.community.service.impl;

import com.community.dao.NoticeRepository;
import com.community.dao.StaffInfoRepository;
import com.community.entity.po.Notice;
import com.community.service.INoticeService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.annotation.Resource;

/**
 * @author Chavy, Walter
 * @date 2020/05/02
 */
@Service
public class NoticeServiceImpl implements INoticeService {

    @Resource
    private NoticeRepository noticeRepository;

    @Resource
    private StaffInfoRepository staffInfoRepository;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateCommunityNotice(Notice notice) {
        Assert.notNull(notice, "更新信息不能为空");
        Assert.notNull(notice.getId(), "主键不能为空");
        Assert.state(notice.getTitle() != null || notice.getContent() != null, "更新内容不能为空");

//        Assert.state(noticeRepository.updateById(notice) == 1, "更新失败");

        return true;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean addCommunityNotice(Notice notice) {
        Assert.notNull(notice, "新增信息不能为空");
        Assert.notNull(notice.getEmployeeId(), "用户id不能为空");
        Assert.notNull(notice.getTitle(), "标题不能为空");
        Assert.notNull(notice.getContent(), "内容不能为空");

        Assert.state(staffInfoRepository.selectStaffExist(notice.getEmployeeId()), "用户不存在或不是工作人员");

//        Assert.state(noticeRepository.insert(notice) == 1, "新增失败");

        return true;
    }

    @Override
    public Page<Notice> getCommunityNotice(Page<Notice> page) {
//        page = noticeRepository.selectPage(page, null);
        return page;
    }
}
