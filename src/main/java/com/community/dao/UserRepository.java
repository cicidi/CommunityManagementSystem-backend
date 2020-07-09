package com.community.dao;

import com.community.entity.po.User;
import org.springframework.data.repository.CrudRepository;

/**
 * <p>
 * Repository 接口
 * </p>
 *
 * @author Walter
 * @since 2020-05-02
 */

public interface UserRepository extends CrudRepository<User, Long> {

    /**
     * 根据登录信息搜索用户
     *
     * @param userName 用户名
     * @param password 密码
     * @return User
     */
    User selectUserByLogin(String userName, String password);

}
