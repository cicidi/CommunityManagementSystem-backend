package com.community.service;

import com.community.entity.po.HouseholdInfo;
import com.community.entity.vo.HouseHoldVo;
import com.community.entity.vo.HouseUserVo;
import org.springframework.data.domain.Page;

/**
 * @author Chavy, Walter
 * @date 2020/05/02
 */
public interface IHouseholdInfoService extends IService<HouseholdInfo> {

    /**
     * 查询住户
     *
     * @param name        姓名
     * @param buildingNum 栋数
     * @param roomNum     房间号
     * @param page        分页bean
     * @return Page<HouseUserVo>
     */
    Page<HouseUserVo> searchUser(String name, Integer buildingNum, Integer roomNum, Page<HouseUserVo> page);

    /**
     * 更新住户信息
     *
     * @param householdInfo 住户信息
     * @return boolean
     */
    boolean updateUserInfo(HouseholdInfo householdInfo);

    /**
     * 增加住户
     *
     * @param houseHoldVo 住户信息
     * @return boolean
     */
    boolean addUser(HouseHoldVo houseHoldVo);
}
