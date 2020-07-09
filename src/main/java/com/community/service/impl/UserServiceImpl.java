package com.community.service.impl;

import com.community.auth.util.SecurityUtil;
import com.community.dao.*;
import com.community.entity.po.Car;
import com.community.entity.po.House;
import com.community.entity.po.HouseholdInfo;
import com.community.entity.po.User;
import com.community.entity.vo.LoginVo;
import com.community.entity.vo.StaffVo;
import com.community.entity.vo.UserDetailVo;
import com.community.entity.vo.UserVo;
import com.community.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.annotation.Resource;

/**
 * @author Chavy, Walter
 * @date 2020/05/02
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserRepository userRepository;

    @Resource
    private RoleRepository roleRepository;

    @Resource
    private UserRoleRepository userRoleRepository;

    @Resource
    private SecurityUtil securityUtil;

    @Resource
    private HouseRepository houseRepository;

    @Resource
    private HouseholdInfoRepository householdInfoRepository;

    @Resource
    private StaffInfoRepository staffInfoRepository;

    @Resource
    private CarRepository carRepository;

    @Override
    public LoginVo login(User user) {
        Assert.notNull(user, "不能为空");
        Assert.notNull(user.getUserName(), "用户名不能为空");
        Assert.notNull(user.getPassword(), "密码不能为空");

        User tempUser = userRepository.selectUserByLogin(user.getUserName(), user.getPassword());
        Assert.notNull(tempUser, "该用户不存在");

        Integer roleId = userRoleRepository.selectRoleIdByUserId(tempUser.getId());
        Assert.notNull(roleId, "系统错误");

//        Role role = roleRepository.selectById(roleId);
//        Assert.notNull(role, "系统错误");

        String token = securityUtil.login(String.valueOf(tempUser.getId()), null, null);

        return new LoginVo().setRoleId(roleId).setUserId(tempUser.getId()).setToken(token);
    }

    @Override
    public UserDetailVo getUserInfo(Long userId) {
        Assert.notNull(userId, "用户id不能为空");

//        User user = userRepository.selectById(userId);

//        Assert.notNull(user, "该用户不存在");

        UserDetailVo userDetailVo = new UserDetailVo();

        HouseholdInfo householdInfo = householdInfoRepository.selectByUserId(userId);

        Assert.notNull(householdInfo, "该用户不是住户");

        House house = houseRepository.selectHouseByUserId(userId);

        Car car = carRepository.selectByUserId(userId);

        UserVo userVo = new UserVo();
//        userVo.setId(userId)
//                .setIdNumber(householdInfo.getIdNumber())
//                .setResidenceAddress(householdInfo.getResidenceAddress())
//                .setAncestralHome(householdInfo.getAncestralHome())
//                .setName(householdInfo.getName())
//                .setSex(householdInfo.getSex())
//                .setUserName(user.getUserName());
//        userDetailVo.setCarInfo(car).setHouseInfo(house).setUserInfo(userVo);
        return userDetailVo;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateAccount(User user) {
        Assert.notNull(user, "更新内容不能为空");
        Assert.notNull(user.getId(), "用户id不能为空");

//        if (user.getUserName() != null) {
//            QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//            queryWrapper.eq(User.USER_NAME, user.getUserName());
//            Assert.state(userRepository.selectOne(queryWrapper) == null, "用户名已存在");
//        }
//
//        Assert.state(userRepository.updateById(user) == 1, "更新失败");
        return true;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean addStaff(StaffVo staffVo) {
        Assert.notNull(staffVo, "传入信息不能为null");
        staffVo.isNotNull();
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq(User.USER_NAME, staffVo.getUserName());
//        Assert.state(userRepository.selectOne(queryWrapper) == null, "该用户名已存在");
//        Assert.state(userRepository.insert(new User().setUserName(staffVo.getUserName()).setPassword(staffVo.getPassword())) == 1,
//                "添加用户失败");
//
//        User user = userRepository.selectOne(queryWrapper);
//        userRoleRepository.insert(new UserRole().setUserId(user.getId()).setRoleId(staffVo.getUserType()));
//
//        staffInfoRepository.insert(StaffVo.convert(staffVo).setUserId(user.getId()));
        return true;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteUser(Long userId) {
        Assert.notNull(userId, "用户id不能为空");
        userRepository.deleteById(userId);
        return true;
    }
}
