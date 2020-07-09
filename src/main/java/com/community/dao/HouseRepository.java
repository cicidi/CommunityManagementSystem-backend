package com.community.dao;

import com.community.entity.po.House;
import org.springframework.data.repository.CrudRepository;

/**
 * <p>
 * Repository 接口
 * </p>
 *
 * @author Walter
 * @since 2020-05-02
 */

public interface HouseRepository extends CrudRepository<House, Long> {

    /**
     * 根据用户id搜索房子
     *
     * @param userId 用户id
     * @return House
     */
    House selectHouseByUserId(Long userId);

}
