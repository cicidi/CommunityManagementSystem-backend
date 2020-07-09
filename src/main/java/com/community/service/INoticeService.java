package com.community.service;


import com.community.entity.po.Notice;
import org.springframework.data.domain.Page;

/**
 * @author Chavy, Walter
 * @date 2020/05/02
 */
public interface INoticeService extends IService<Notice> {

    /**
     * 更新社区通知
     *
     * @param notice 通知
     * @return boolean
     */
    boolean updateCommunityNotice(Notice notice);

    /**
     * 新增社区通知
     *
     * @param notice 通知
     * @return boolean
     */
    boolean addCommunityNotice(Notice notice);

    /**
     * 分页获取社区通知
     *
     * @param page 分页bean
     * @return Page<Notice>
     */
    Page<Notice> getCommunityNotice(Page<Notice> page);
}
