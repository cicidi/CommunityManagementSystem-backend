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
public class HouseholdInfo extends DatabaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String ID = "id";
    public static final String USER_ID = "user_id";
    public static final String NAME = "name";
    public static final String ID_NUMBER = "id_number";
    public static final String SEX = "sex";
    public static final String ANCESTRAL_HOME = "ancestral_home";
    public static final String RESIDENCE_ADDRESS = "residence_address";

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 真实姓名
     */
    private String name;

    /**
     * 身份证
     */
    private String idNumber;

    /**
     * 性别 0-男 1-女
     */
    private Integer sex;

    /**
     * 籍贯
     */
    private String ancestralHome;

    /**
     * 户口所在地
     */
    private String residenceAddress;
}
