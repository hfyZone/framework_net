package com.hanfeiyang.framework;

import com.hanfeiyang.framework.bussiness.ddns.enetity.AliAccessKey;
import com.hanfeiyang.framework.bussiness.ddns.service.IDDNSService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FrameworkNetApplicationTests {

    @Autowired
    IDDNSService ddnsService;

    @Test
    void contextLoads() {
        ddnsService.doDDNS();
    }

}
