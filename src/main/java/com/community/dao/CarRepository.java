package com.community.dao;

import com.community.entity.po.Car;
import org.springframework.data.repository.CrudRepository;

/**
 * <p>
 * Repository 接口
 * </p>
 *
 * @author Walter
 * @since 2020-05-02
 */

public interface CarRepository extends CrudRepository<Car, Long> {

    /**
     * 根据用户id搜索
     *
     * @param userId 用户id
     * @return Car
     */
    Car selectByUserId(Long userId);
}
