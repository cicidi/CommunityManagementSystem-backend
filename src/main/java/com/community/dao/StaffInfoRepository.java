package com.community.dao;

import com.community.entity.po.StaffInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * <p>
 * Repository 接口
 * </p>
 *
 * @author Walter
 * @since 2020-05-02
 */

public interface StaffInfoRepository extends CrudRepository<StaffInfo, Long> {

    /**
     * 判断工作人员是否存在
     *
     * @param userId 用户id
     * @return boolean
     */
    boolean selectStaffExist(Long userId);

    /**
     * 根据用户id搜索工作人员信息
     *
     * @param userId 用户id
     * @return StaffInfo
     */
    StaffInfo selectByUserId(Long userId);

}
