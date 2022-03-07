package com.hanfeiyang.framework.utils;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;

import java.util.Collections;

public class CodeGenerator {

    public static void main(String[] args) {

        // 需要配置的字段
        String url = "jdbc:mysql://db.youngcloud.top:3306/framework_net?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
        String username = "root";
        String password = "666666";
        String author = "hanfeiyang";
        String packageName = "com.hanfeiyang.framework.business.cron";
        String[] tables = {"schedul"};
        String outputDir = "D:\\myProj\\framework_net\\src\\main\\java\\";
        String outputXmlDir = "D:\\myProj\\framework_net\\src\\main\\resources\\mapper";
        FastAutoGenerator
                .create(url,username, password)
                .globalConfig(builder -> {
                    builder.author(author) // 设置作者
                            // .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir(outputDir); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent(packageName) // 设置父包名
                    // .moduleName("system") // 设置父包模块名
                     .pathInfo(Collections.singletonMap(OutputFile.mapperXml, outputXmlDir)); // 设置mapperXml生成路径。注释不生成xml
                })
                .strategyConfig(builder -> {
                    builder.addInclude(tables); // 设置需要生成的表名
                    // .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                // .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }

}
