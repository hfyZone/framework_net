package com.hanfeiyang.framework;

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

    @Test
    void contextLoads() {
        List<DomainDTO> domainDTOList = new ArrayList<>();
        domainDTOList.add(new DomainDTO().setDomainRecord("@").setDomainName("hanfeiyang.com"));
        ddnsService.doDDNS(domainDTOList);
    }

}
