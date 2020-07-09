package com.community.dao;

import com.community.entity.po.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * <p>
 * Repository 接口
 * </p>
 *
 * @author Walter
 * @since 2020-05-02
 */

public interface RoleRepository extends CrudRepository<Role, Long> {

}
