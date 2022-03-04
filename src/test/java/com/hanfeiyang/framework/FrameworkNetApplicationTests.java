package com.hanfeiyang.framework;

import com.hanfeiyang.framework.bussiness.ddns.service.IDdnsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootTest
class FrameworkNetApplicationTests {

    @Autowired
    IDdnsService ddnsService;

    @Test
    void contextLoads() {
        ddnsService.doDDNS(new ArrayList<>(Arrays.asList("*", "@")));
    }

}
