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
public class Notice extends DatabaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 发布的工作人员id
     */
    private Long employeeId;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;
}
