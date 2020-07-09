package com.community.service;

import com.community.entity.po.DailyDuty;
import com.community.entity.vo.DutyFromVo;
import org.springframework.data.domain.Page;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Chavy, Walter
 * @date  2020/05/02
 */
public interface IDailyDutyService extends IService<DailyDuty> {

    /**
     * 批量删除值班信息
     * @param ids id列表
     * @return boolean
     */
    boolean deleteDuty(List<Long> ids);

    /**
     * 新增值班信息
     * @param dailyDuty 值班信息
     * @return boolean
     */
    boolean addDutyForm(DailyDuty dailyDuty);

    /**
     * 分页获取值班表
     * @param date 日期
     * @param type 类型
     * @param page 分页bean
     * @return Page<DutyFromVo>
     */
    Page<DutyFromVo> getDutyInfo(LocalDate date, Integer type, Page<DutyFromVo> page);

}
