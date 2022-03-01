package com.hanfeiyang.framework.utils;


import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * @author HanFeiYang
 * @date 2022/3/1 17:24
 */
public class CodeAutoGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://db.youngcloud.top:3306/framework_net",
                "root",
                "123456")
                .globalConfig(builder -> {
                    builder.author("hanfeiyang") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("/Users/hanfeiyang/IdeaProjects/framework_net/src/main/java/com/hanfeiyang/framework/ddns"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.hanfeiyang.framework") // 设置父包名
                            .moduleName("ddns") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "D://")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("params");// 设置需要生成的表名
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
