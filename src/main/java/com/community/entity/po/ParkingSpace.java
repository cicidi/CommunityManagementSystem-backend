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
public class ParkingSpace extends DatabaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 车位号
     */
    private Integer spaceNumber;

}
