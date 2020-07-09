package com.community.entity.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * @author Chavy, Walter
 * @date 2020/05/02
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
@Entity
public class HouseUser extends DatabaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String HOUSE_ID = "house_id";
    public static final String USER_ID = "user_id";

    /**
     * 房屋id
     */
    private Integer houseId;

    /**
     * 住户id
     */
    private Long userId;

}
