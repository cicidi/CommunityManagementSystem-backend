package com.community.service.impl;

import com.community.dao.HouseRepository;
import com.community.dao.HouseholdInfoRepository;
import com.community.entity.vo.HouseInfoVo;
import com.community.service.IHouseService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Chavy, Walter
 * @date 2020/05/02
 */
@Service
public class HouseServiceImpl implements IHouseService {

    @Resource
    private HouseRepository houseRepository;

    @Resource
    private HouseholdInfoRepository householdInfoRepository;

    @Override
    public Page<HouseInfoVo> getHouseInfo(Long userId, Integer buildingNum, Page<HouseInfoVo> page) {
//
//        Page<House> housePage = new Page<>(page.getCurrent(), page.getSize());
//
//        QueryWrapper<House> queryWrapper = new QueryWrapper<>();
//        if(userId != null){
//            queryWrapper.eq(House.USER_ID, userId);
//        }
//        if(buildingNum != null){
//            queryWrapper.eq(House.BUILDING_NUMBER, buildingNum);
//        }
//
//        housePage = houseRepository.selectPage(housePage, queryWrapper);
//        //拿出全部的用户id
//        List<Long> userIds = housePage.getRecords().stream().filter(house -> house.getUserId() != null).map(House::getUserId).collect(Collectors.toList());
//        QueryWrapper<HouseholdInfo> householdInfoQueryWrapper = new QueryWrapper<>();
//        householdInfoQueryWrapper.select(HouseholdInfo.USER_ID, HouseholdInfo.NAME);
//        if(!userIds.isEmpty()) {
//            householdInfoQueryWrapper.in(HouseholdInfo.USER_ID, userIds);
//        }
//        Map<Long, String> names = householdInfoRepository.selectList(householdInfoQueryWrapper)
//                .stream().collect(Collectors.toMap(HouseholdInfo::getUserId, HouseholdInfo::getName));
//        //设置name
//        page.setRecords(housePage.getRecords().stream().map(house -> {
//            HouseInfoVo houseInfoVo = HouseInfoVo.convert(house);
//            if(house.getUserId() != null) {
//                houseInfoVo.setName(names.get(house.getUserId()));
//            }
//            return houseInfoVo;
//        }).collect(Collectors.toList()));
//        page.setTotal(housePage.getTotal());
        return page;
    }
}
