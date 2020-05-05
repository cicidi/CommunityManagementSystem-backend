package com.writingcode.www.community.controller;

import com.writingcode.www.community.entity.po.HouseholdInfo;
import com.writingcode.www.community.entity.vo.HouseUserVo;
import com.writingcode.www.community.result.CommonResult;
import com.writingcode.www.community.service.IHouseholdInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 * @author Chavy
 * @date 2020/5/5 21:53
 */
@RestController
@RequestMapping("/api/user")
public class HouseHoldController {

    @Resource
    private IHouseholdInfoService householdInfoService;

    /**
     * 查询住户
     * @param name 姓名
     * @param buildingNumber 栋数
     * @param roomNumber 房间号
     * @return CommonResult<List<HouseholdInfo>>
     */
    @GetMapping("/searchUser")
    public CommonResult<List<HouseUserVo>> searchUser(@RequestParam(value = "name", required = false) String name,
                                                      @RequestParam(value = "buildingNumber", required = false) Integer buildingNumber,
                                                      @RequestParam(value = "roomNumber", required = false) Integer roomNumber){
        return new CommonResult<List<HouseUserVo>>().success(householdInfoService.searchUser(name, buildingNumber, roomNumber));
    }
}
