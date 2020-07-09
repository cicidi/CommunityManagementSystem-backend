package com.community.controller;

import com.community.entity.vo.HouseUserVo;
import com.community.result.CommonResult;
import com.community.service.IHouseholdInfoService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Chavy, Walter
 * @date 2020/5/5 21:53
 */
@RestController
@RequestMapping("/api/user")
public class HouseHoldController {

    @Resource
    private IHouseholdInfoService householdInfoService;

    /**
     * 查询住户
     *
     * @param name           姓名
     * @param buildingNumber 栋数
     * @param roomNumber     房间号
     * @return CommonResult<List < HouseholdInfo>>
     */
    @GetMapping("/searchUser")
    public CommonResult<Page<HouseUserVo>> searchUser(@RequestParam(value = "name", required = false) String name,
                                                      @RequestParam(value = "buildingNumber", required = false) Integer buildingNumber,
                                                      @RequestParam(value = "roomNumber", required = false) Integer roomNumber,
                                                      @RequestParam(value = "current", defaultValue = "1") int current,
                                                      @RequestParam(value = "size", defaultValue = "10") int size) {
//        return new CommonResult<Page<HouseUserVo>>().success(householdInfoService.searchUser(name, buildingNumber, roomNumber, new Page<>(current, size)));
        return null;
    }
}
