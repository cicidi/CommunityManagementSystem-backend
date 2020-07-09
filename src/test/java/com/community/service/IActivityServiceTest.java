package com.community.service;


import com.community.entity.po.Activity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class IActivityServiceTest {

    @Resource
    private IActivityService activityService;

    @Rollback
    @Transactional
    @Test
    void deleteCommunityActivity() {
        List<Integer> ids = new LinkedList<>();
        ids.add(1000);
        Assertions.assertThrows(IllegalArgumentException.class, () -> activityService.deleteCommunityActivity(null));
        Assertions.assertThrows(IllegalStateException.class, () -> activityService.deleteCommunityActivity(new LinkedList<>()));
//        Assertions.assertThrows(IllegalStateException.class, () -> activityService.deleteCommunityActivity(ids));
        ids.remove(0);
        ids.add(1);
//        assertTrue(activityService.deleteCommunityActivity(ids));
    }

    @Rollback
    @Transactional
    @Test
    void updateCommunityActivity() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> activityService.updateCommunityActivity(null));
        Assertions.assertThrows(IllegalArgumentException.class, () -> activityService.updateCommunityActivity(new Activity()));
//        Assertions.assertThrows(IllegalStateException.class, () -> activityService.updateCommunityActivity(new Activity().setId(1000).setContent("HAHA")));
//        assertTrue(activityService.updateCommunityActivity(new Activity().setId(1).setContent("改一下内容")));
    }

    @Rollback
    @Transactional
    @Test
    void addCommunityActivity() {
        Activity activity = new Activity();
        Assertions.assertThrows(IllegalArgumentException.class, () -> activityService.addCommunityActivity(null));
        Assertions.assertThrows(IllegalArgumentException.class, () -> activityService.addCommunityActivity(activity));
        Assertions.assertThrows(IllegalArgumentException.class, () -> activityService.addCommunityActivity(activity.setContent("HA")));
        Assertions.assertThrows(IllegalArgumentException.class, () -> activityService.addCommunityActivity(activity.setActivityName("ha")));
        Assertions.assertThrows(IllegalArgumentException.class, () -> activityService.addCommunityActivity(activity.setHost("是我")));
        Assertions.assertThrows(IllegalArgumentException.class, () -> activityService.addCommunityActivity(activity.setPrincipal("不是我")));
        assertTrue(activityService.addCommunityActivity(activity.setTelNumber("11111111111")));
    }

//    @Test
//    void getCommunityActivity() {
//        Assertions.assertNotNull(activityService.getCommunityActivity(new Page<>(1, 10)));
//    }
}