package com.hanfeiyang.framework.business.ddns.tasks;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.hanfeiyang.framework.business.cron.task.ScheduledOfTask;
import com.hanfeiyang.framework.business.ddns.entity.Domain;
import com.hanfeiyang.framework.business.ddns.entity.dto.DomainDTO;
import com.hanfeiyang.framework.business.ddns.service.IDdnsService;
import com.hanfeiyang.framework.business.ddns.service.IDomainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class DdnsTask implements ScheduledOfTask {
    @Autowired
    IDomainService domainService;

    @Autowired
    IDdnsService ddnsService;

    @Override
    public void execute() {
        log.info("[DdnsTask]开始执行。");
        List<Domain> domainList = domainService.list();
        List<DomainDTO> domainDTOList = new ArrayList<>();
        domainList.forEach(domain -> {
            DomainDTO domainDTO = new DomainDTO();
            BeanUtils.copyProperties(domain, domainDTO);
            domainDTOList.add(domainDTO);
        });
        log.info("待解析的域名为" + domainDTOList.toString());
        ddnsService.doDDNS(domainDTOList);
        log.info("[DdnsTask]结束执行。");
    }
}
