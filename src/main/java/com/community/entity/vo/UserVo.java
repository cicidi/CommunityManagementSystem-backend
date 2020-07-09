package com.community.entity.vo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Chavy, Walter
 * @date 2020/5/27
 */
@Data
@Accessors(chain = true)
public class UserVo {

    private Long id;

    private String userName;

    private String name;

    private String idNumber;

    private int sex;

    private String ancestralHome;

    private String residenceAddress;

}
