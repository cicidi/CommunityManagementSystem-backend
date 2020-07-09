package com.community.controller;

import com.community.entity.vo.HouseInfoVo;
import com.community.result.CommonResult;
import com.community.service.IHouseService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Chavy, Walter
 * @date 2020/5/4 17:15
 */
@RestController
@RequestMapping("/api/house")
public class HouseController {

    @Resource
    private IHouseService houseService;

    /**
     * 查询房屋信息
     *
     * @param userId      用户id
     * @param buildingNum 栋数
     * @param current     页码 默认1
     * @param size        页码大小 默认10
     * @return CommonResult<Page < HouseInfoVo>>
     */
    @GetMapping("/getHouseInfo")
    public CommonResult<Page<HouseInfoVo>> getHouseInfo(@RequestParam(value = "userId", required = false) Long userId,
                                                        @RequestParam(value = "buildingNum", required = false) Integer buildingNum,
                                                        @RequestParam(value = "current", defaultValue = "1") int current,
                                                        @RequestParam(value = "size", defaultValue = "10") int size) {

//        return new CommonResult<Page<HouseInfoVo>>().success(houseService.getHouseInfo(userId, buildingNum,
//                new Page<>(current, size)));
        return null;
    }
}
