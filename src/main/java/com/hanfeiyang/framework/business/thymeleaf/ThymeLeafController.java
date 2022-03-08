package com.hanfeiyang.framework.business.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author HanFeiYang
 * @date 2022/3/8 14:03
 */
@Controller
public class ThymeLeafController {
    @GetMapping("wait")//页面的url地址
    public String getindex(Model model)//对应函数
    {
        model.addAttribute("title","韩飞洋的主站");
        model.addAttribute("name","hanfeiyang.com");
        return "wait";//与templates中index.html对应
    }
}
