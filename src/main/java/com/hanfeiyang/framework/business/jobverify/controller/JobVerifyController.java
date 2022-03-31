package com.hanfeiyang.framework.business.jobverify.controller;

import com.hanfeiyang.framework.business.jobverify.service.JobVerifyService;
import com.hanfeiyang.framework.utils.R;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @author HanFeiYang
 * @date 2022/3/31 16:32
 */
@RestController
@RequestMapping("/jobVerify")
@ApiOperation(value = "工时校验")
public class JobVerifyController {
    @Autowired
    JobVerifyService jobVerifyService;

    @PostMapping
    public R doJobVerify(@RequestParam("file") MultipartFile file){
        try{
            return R.success(jobVerifyService.simpleRead(file.getInputStream()));
        }catch (Exception e){
            e.printStackTrace();
        }
        return R.failure();
    }
}
