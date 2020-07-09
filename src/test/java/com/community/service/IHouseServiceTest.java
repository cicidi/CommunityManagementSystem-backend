package com.community.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class IHouseServiceTest {

    @Resource
    private IHouseService iHouseService;

    @Test
    void getHouseInfo() {
//        Assertions.assertNotNull(iHouseService.getHouseInfo(null, null, new Page<>(1 ,10)));
//        Assertions.assertNotNull(iHouseService.getHouseInfo(2L, null, new Page<>(1 ,10)));
//        Assertions.assertNotNull(iHouseService.getHouseInfo(null, 1, new Page<>(1 ,10)));
//        System.out.println(iHouseService.getHouseInfo(2L, null, new Page<>(1 ,10)).getRecords().toString());
    }
}