package com.community.service.impl;

import com.community.dao.CarRepository;
import com.community.entity.po.Car;
import com.community.service.ICarService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.annotation.Resource;

/**
 * @author Chavy, Walter
 * @date 2020/05/02
 */
@Service
public class CarServiceImpl implements ICarService {

    @Resource
    private CarRepository carRepository;

    @Override
    public Car selectCarByUserId(Long userId) {
        Assert.notNull(userId, "用户id不能为空");
        return carRepository.selectByUserId(userId);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean addCarInfo(Car car) {
        Assert.notNull(car, "车辆不能为空");
        Assert.notNull(car.getUserId(), "用户id不能为空");
        Assert.notNull(car.getPlateNumber(), "车牌号不能为空");
        carRepository.save(car);
        return true;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateCarInfo(Car car) {
        Assert.notNull(car, "车辆信息不能为空");
        Assert.notNull(car.getId(), "车辆主键不能为空");
        carRepository.save(car);
        return true;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteCarInfo(Long id) {
        Assert.notNull(id, "id不能为空");
        //TBD
//        Assert.state(carRepository.deleteById(id) , "该车辆不存在");
        return true;
    }
}
