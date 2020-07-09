package com.community.dao;

import com.community.entity.po.DailyDuty;
import org.springframework.data.repository.CrudRepository;

/**
 * <p>
 * Repository 接口
 * </p>
 *
 * @author Walter
 * @since 2020-05-02
 */

public interface DailyDutyRepository extends CrudRepository<DailyDuty, Long> {

}
