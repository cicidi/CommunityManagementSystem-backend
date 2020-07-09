package com.community.dao;

import com.community.entity.po.UserRole;
import org.springframework.data.repository.CrudRepository;

/**
 * <p>
 * Repository 接口
 * </p>
 *
 * @author Walter
 * @since 2020-05-02
 */

public interface UserRoleRepository extends CrudRepository<UserRole, Long> {

    /**
     * 根据用户id获取角色id
     *
     * @param userId 用户id
     * @return roleId
     */
    Integer selectRoleIdByUserId(Long userId);
}
