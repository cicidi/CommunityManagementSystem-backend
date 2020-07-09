package com.community.service.impl;

import com.community.dao.*;
import com.community.entity.po.HouseholdInfo;
import com.community.entity.vo.HouseHoldVo;
import com.community.entity.vo.HouseUserVo;
import com.community.service.IHouseholdInfoService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author Chavy, Walter
 * @date 2020/05/02
 */
@Service
public class HouseholdInfoServiceImpl implements IHouseholdInfoService {

    @Resource
    private HouseholdInfoRepository householdInfoRepository;

    @Resource
    private HouseRepository houseRepository;

    @Resource
    private HouseUserRepository houseUserRepository;

    @Resource
    private CarRepository carRepository;

    @Resource
    private UserRepository userRepository;

    @Resource
    private UserRoleRepository userRoleRepository;


    @Override
    public Page<HouseUserVo> searchUser(String name, Integer buildingNum, Integer roomNum, Page<HouseUserVo> page) {
//        HouseholdPageDto householdPageDto = new HouseholdPageDto()
//                .setBuildingNum(buildingNum)
//                .setRoomNum(roomNum)
//                .setName(name)
//                .setSize(page.getSize()).setOffset((page.getCurrent() - 1) * page.getSize());
//        List<HouseUserVo> houseUserVoList = householdInfoRepository.selectHouseUser(householdPageDto);
//
//        houseUserVoList.forEach(houseUserVo -> {
//            Car car = carRepository.selectByUserId(houseUserVo.getUserId());
//            if (car != null) {
//                houseUserVo.setPlateNumber(car.getPlateNumber());
//            }
//        });
//
//        page.setRecords(houseUserVoList);
//        page.setTotal(householdInfoRepository.selectHouseUserCount(householdPageDto));
        return page;
    }

    @Override
    public boolean updateUserInfo(HouseholdInfo householdInfo) {
//        Assert.notNull(householdInfo, "更新内容不能为空");
//        Assert.notNull(householdInfo.getId(), "主键不能为空");
//
//        Assert.state(householdInfoRepository.updateById(householdInfo) == 1, "更新失败");
        return true;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean addUser(HouseHoldVo houseHoldVo) {
//        Assert.notNull(houseHoldVo, "传入信息不能为null");
//        houseHoldVo.isNotNull();
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq(User.USER_NAME, houseHoldVo.getUserName());
//        Assert.state(userRepository.selectOne(queryWrapper) == null, "该用户名已存在");
//        Assert.state(userRepository.insert(new User().setUserName(houseHoldVo.getUserName()).setPassword(houseHoldVo.getPassword())) == 1,
//                "添加用户失败");
//        User user = userRepository.selectOne(queryWrapper);
//        userRoleRepository.insert(new UserRole().setUserId(user.getId()).setRoleId(2));
//
//        QueryWrapper<House> queryWrapper1 = new QueryWrapper<>();
//        queryWrapper1.eq(House.ROOM_NUMBER, houseHoldVo.getRoomNumber()).eq(House.BUILDING_NUMBER, houseHoldVo.getBuildingNumber());
//        House house = houseRepository.selectOne(queryWrapper1);
//        Assert.notNull(house, "该房间不存在");
//        householdInfoRepository.insert(HouseHoldVo.convert(houseHoldVo).setUserId(user.getId()));
//        houseUserRepository.insert(new HouseUser().setHouseId(house.getId()).setUserId(user.getId()));
        return true;
    }
}
