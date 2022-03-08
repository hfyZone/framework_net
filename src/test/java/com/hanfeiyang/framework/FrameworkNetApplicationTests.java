package com.hanfeiyang.framework;

import com.hanfeiyang.framework.business.cron.service.ISchedulService;
import com.hanfeiyang.framework.business.ddns.entity.dto.DomainDTO;
import com.hanfeiyang.framework.business.ddns.service.IDdnsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class FrameworkNetApplicationTests {

    @Autowired
    IDdnsService ddnsService;

    @Autowired
    ISchedulService schedulService;

    @Test
    void contextLoads() {
        schedulService.list();
        System.out.println();
    }

}
