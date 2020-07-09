package com.community.service;

import com.community.entity.po.Repair;
import com.community.entity.vo.RepairVo;
import org.springframework.data.domain.Page;

/**
 * @author Chavy, Walter
 * @date 2020/05/02
 */
public interface IRepairService extends IService<Repair> {

    /**
     * 添加保修单
     *
     * @param repair 保修单
     * @return boolean
     */
    boolean addRepair(Repair repair);

    /**
     * 更新保修单
     *
     * @param repair 保修单
     * @return boolean
     */
    boolean updateRepair(Repair repair);

    /**
     * 分页查询保修单
     *
     * @param userId 用户id
     * @param page   分页bean
     * @return Page<RepairVo>
     */
    Page<RepairVo> getRepair(Long userId, Page<RepairVo> page);

}
