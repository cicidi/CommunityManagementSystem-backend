package com.community.entity.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Chavy, Walter
 * @date 2020/05/02
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
@Entity
public class House extends DatabaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String ID = "id";
    public static final String UNIT_TYPE = "unit_type";
    public static final String AREA = "area";
    public static final String BUILDING_NUMBER = "building_number";
    public static final String ROOM_NUMBER = "room_number";
    public static final String IS_IDLE = "is_idle";
    public static final String CHECK_IN_TIME = "check_in_time";
    public static final String USER_ID = "user_id";

    /**
     * 户型
     */
    private Integer unitType;

    /**
     * 面积
     */
    private Float area;

    /**
     * 栋数
     */
    private Integer buildingNumber;

    private Integer roomNumber;

    /**
     * 是否空闲 0-是 1-不是
     */
    private Integer isIdle;

    /**
     * 入住时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime checkInTime;

    /**
     * 用户id 户主
     */
    private Long userId;

}
