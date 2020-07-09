package com.community.entity.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author Chavy, Walter
 * @date 2020/05/02
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
@Entity
public class Car extends DatabaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String ID = "id";
    public static final String USER_ID = "user_id";
    public static final String PLATE_NUMBER = "plate_number";
    public static final String BRAND = "brand";
    public static final String MODEL = "model";
    public static final String COLOR = "color";

    /**
     * 车主用户id
     */
    private Long userId;

    /**
     * 车牌号
     */
    private String plateNumber;

    /**
     * 品牌
     */
    private String brand;

    /**
     * 型号
     */
    private String model;

    /**
     * 颜色
     */
    private String color;

}
