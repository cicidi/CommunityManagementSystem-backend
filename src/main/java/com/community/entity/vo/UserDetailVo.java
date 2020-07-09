package com.community.entity.vo;

import com.community.entity.po.Car;
import com.community.entity.po.House;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Chavy, Walter
 * @date 2020/5/5 22:30
 */
@Data
@Accessors(chain = true)
public class UserDetailVo {

    private House houseInfo;

    private Car carInfo;

    private UserVo userInfo;
}
