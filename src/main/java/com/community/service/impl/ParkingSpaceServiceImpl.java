package com.community.service.impl;

import com.community.dao.ParkingSpaceRepository;
import com.community.entity.po.ParkingSpace;
import com.community.service.IParkingSpaceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Chavy, Walter
 * @date 2020/05/02
 */
@Service
public class ParkingSpaceServiceImpl implements IParkingSpaceService {

    @Resource
    private ParkingSpaceRepository parkingSpaceRepository;

    @Override
    public List<ParkingSpace> getParkingInfo() {
//        return parkingSpaceRepository.selectList(null);
        return null;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addParking(List<Integer> spaceNumber) {
        Assert.notNull(spaceNumber, "车位号不为空");
        Assert.state(!spaceNumber.isEmpty(), "不能空车位号");
        List<ParkingSpace> parkingSpaces = new LinkedList<>();
        spaceNumber.forEach(integer -> {
            parkingSpaces.add(new ParkingSpace().setSpaceNumber(integer));
        });
//        parkingSpaces.forEach(parkingSpace -> Assert.state(parkingSpaceRepository.insert(parkingSpace) == 1, "插入失败"));
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void deleteParking(List<Integer> ids) {
        Assert.notNull(ids, "车位号不为空");
        Assert.state(!ids.isEmpty(), "不能空车位号");
//        Assert.state(parkingSpaceRepository.deleteBatchIds(ids) == ids.size(), "删除失败");
    }
}
