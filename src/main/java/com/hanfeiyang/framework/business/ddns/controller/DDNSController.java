package com.hanfeiyang.framework.business.ddns.controller;

import com.hanfeiyang.framework.business.ddns.entity.dto.DomainDTO;
import com.hanfeiyang.framework.business.ddns.service.IDdnsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author HanFeiYang
 * @date 2022/3/3 13:49
 */
@RestController
@RequestMapping("/ddns")
public class DDNSController {
    @Autowired
    IDdnsService ddnsService;

    @PostMapping
    public void doDDNS(@RequestParam List<DomainDTO> domainDTOList){
        ddnsService.doDDNS(domainDTOList);
    }
}
