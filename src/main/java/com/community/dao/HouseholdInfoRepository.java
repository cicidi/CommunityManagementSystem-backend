package com.community.dao;

import com.community.entity.dto.HouseholdPageDto;
import com.community.entity.po.HouseholdInfo;
import com.community.entity.vo.HouseUserVo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * <p>
 * Repository 接口
 * </p>
 *
 * @author Walter
 * @since 2020-05-02
 */

public interface HouseholdInfoRepository extends CrudRepository<HouseholdInfo, Long> {


    /**
     * 根据用户id搜索信息
     *
     * @param userId 用户id
     * @return HouseholdInfo
     */
    HouseholdInfo selectByUserId(Long userId);

    /**
     * 分页查询住户
     *
     * @param householdPageDto 条件
     * @return List<HouseUserVo>
     */
    List<HouseUserVo> selectHouseUser(HouseholdPageDto householdPageDto);

    /**
     * 查询总数
     *
     * @param householdPageDto 条件
     * @return 总数
     */
    Integer selectHouseUserCount(HouseholdPageDto householdPageDto);
}
