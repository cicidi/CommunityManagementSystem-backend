package com.community.dao;

import com.community.entity.po.Notice;
import org.springframework.data.repository.CrudRepository;

/**
 * <p>
 * Repository 接口
 * </p>
 *
 * @author Walter
 * @since 2020-05-02
 */

public interface NoticeRepository extends CrudRepository<Notice, Long> {

}
