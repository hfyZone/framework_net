package com.hanfeiyang.framework.bussiness.ddns.controller;

import com.hanfeiyang.framework.bussiness.ddns.service.IDdnsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author HanFeiYang
 * @date 2022/3/3 13:49
 */
@RestController
@RequestMapping("/ddns/")
public class DDNSController {
    @Autowired
    IDdnsService ddnsService;

    @GetMapping
    public void doDDNS(@RequestParam List<String> recList){
        ddnsService.doDDNS(recList);
    }
}
