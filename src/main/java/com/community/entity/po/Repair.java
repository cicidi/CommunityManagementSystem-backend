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
public class Repair extends DatabaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String ID = "id";
    public static final String FACILITY = "facility";
    public static final String PLACE = "place";
    public static final String REASON = "reason";
    public static final String USER_ID = "user_id";
    public static final String CREATE_TIME = "create_time";
    public static final String IS_RECEIVED = "is_received";
    public static final String EMPLOYEE_ID = "employee_id";
    public static final String HANDLE_TIME = "handle_time";
    public static final String RESULT = "result";

    /**
     * 设施
     */
    private String facility;

    /**
     * 所在地
     */
    private String place;

    /**
     * 保修原因
     */
    private String reason;

    /**
     * 保修的用户id
     */
    private Long userId;
    /**
     * 是否被受理 0-否 1-是
     */
    private Integer isReceived;

    /**
     * 工作人员的用户id
     */
    private Long employeeId;

    /**
     * 处理时间
     */
    private LocalDateTime handleTime;

    /**
     * 处理结果
     */
    private String result;

}
