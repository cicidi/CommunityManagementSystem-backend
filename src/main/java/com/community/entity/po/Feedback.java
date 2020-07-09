package com.community.entity.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Chavy, Walter
 * @date 2020/05/02
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Getter
@Accessors(chain = true)
@Entity
public class Feedback extends DatabaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 反馈类型 0-建议 1-投诉
     */
    private Integer type;

    /**
     * 反馈的用户id
     */
    private Long userId;

    /**
     * 内容
     */
    private String details;

    /**
     * 是否被受理 0-否 1-是
     */
    private Integer isReceived;

    /**
     * 工作人员id
     */
    private Long employeeId;

    /**
     * 处理结果
     */
    private String result;


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
