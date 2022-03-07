package com.hanfeiyang.framework;

import com.hanfeiyang.framework.business.ddns.enetity.dto.DdnsDTO;
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

    @Test
    void contextLoads() {
        List<DdnsDTO> ddnsDTOList = new ArrayList<>();
        ddnsDTOList.add(new DdnsDTO().setRecord("@").setDomainName("hanfeiyang.com"));
        ddnsService.doDDNS(ddnsDTOList);
    }

}
