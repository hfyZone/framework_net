package com.hanfeiyang.framework.business.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author HanFeiYang
 * @date 2022/3/8 14:03
 */
@Controller
public class ThymeLeafController {
    @GetMapping("/")//页面的url地址
    public String getindex(Model model)//对应函数
    {
        model.addAttribute("title","韩飞洋的主站");
        model.addAttribute("name","hanfeiyang.com");
        return "index";//与templates中index.html对应
    }

    @GetMapping("/ddns")
    public String getddns(Model model){
        model.addAttribute("title","DDNS");
        model.addAttribute("name","DDNS");
        return "function";
    }
}
