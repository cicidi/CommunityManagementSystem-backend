package com.community.service;

import com.community.entity.po.House;
import com.community.entity.vo.HouseInfoVo;
import org.springframework.data.domain.Page;

/**
 * @author Chavy, Walter
 * @date 2020/05/02
 */
public interface IHouseService extends IService<House> {

    /**
     * 查询房屋信息
     *
     * @param userId      用户id
     * @param buildingNum 栋数
     * @param page        分页bean
     * @return Page<HouseInfoVo>
     */
    Page<HouseInfoVo> getHouseInfo(Long userId, Integer buildingNum, Page<HouseInfoVo> page);

}
