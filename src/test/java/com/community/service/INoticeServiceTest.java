package com.community.service;


import com.community.entity.po.Notice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class INoticeServiceTest {

    @Resource
    private INoticeService noticeService;

    @Rollback
    @Transactional
    @Test
    void updateCommunityNotice() {
    }

    @Rollback
    @Transactional
    @Test
    void addCommunityNotice() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> noticeService.addCommunityNotice(null));
        Assertions.assertThrows(IllegalArgumentException.class, () -> noticeService.addCommunityNotice(new Notice()));
        Assertions.assertThrows(IllegalStateException.class, () ->
                noticeService.addCommunityNotice(((Notice) new Notice().setId(1)).setEmployeeId(1L).setTitle("Ha").setContent("Ha")));
        Assertions.assertThrows(IllegalStateException.class, () ->
                noticeService.addCommunityNotice(((Notice) new Notice().setId(1)).setEmployeeId(1000L).setTitle("Ha").setContent("Ha")));
        assertTrue(noticeService.addCommunityNotice(((Notice) new Notice().setId(1)).setEmployeeId(3L).setTitle("Ha").setContent("别进来了")));
    }

    @Test
    void getCommunityNotice() {
//        Assertions.assertNotNull(noticeService.getCommunityNotice(new Page<>(1, 10)));
    }
}