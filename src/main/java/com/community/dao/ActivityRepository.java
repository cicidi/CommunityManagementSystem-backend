package com.community.dao;

import com.community.entity.po.Activity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

/**
 * <p>
 * Repository 接口
 * </p>
 *
 * @author Walter
 * @since 2020-05-02
 */
public interface ActivityRepository extends CrudRepository<Activity, Long> {

}
