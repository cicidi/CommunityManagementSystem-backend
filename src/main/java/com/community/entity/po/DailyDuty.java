package com.community.entity.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Chavy, Walter
 * @date 2020/05/02
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
@Entity
public class DailyDuty extends DatabaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String ID = "id";
    public static final String DATE = "date";
    public static final String EMPLOYEE_ID = "employee_id";
    public static final String TYPE = "type";
    public static final String PLACE = "place";

    /**
     * 值班日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    /**
     * 用户id
     */
    private Long employeeId;

    /**
     * 值班类型  0清洁/1巡查/2安保
     */
    private Integer type;

    /**
     * 值班区域
     */
    private String place;


    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @CreationTimestamp
    private LocalDateTime createTimeStamp;

    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @UpdateTimestamp
    private LocalDateTime updateTimeStamp;

}
