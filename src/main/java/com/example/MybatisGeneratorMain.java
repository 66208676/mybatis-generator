package com.example;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ZQ
 * @version 1.0
 * @Description
 * @date 2020/8/14 16:57
 */
public class MybatisGeneratorMain {
    /**
     * 启动程序
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        List<String> warnings = new ArrayList<>();

        ConfigurationParser cp = new ConfigurationParser(warnings);

//        Configuration config = cp.parseConfiguration(new File("E:\\ttg\\mybatis-generator\\src\\main\\resources\\mybatis-generator-config.xml"));

         Configuration config = cp.parseConfiguration(ClassLoader.getSystemResourceAsStream("mybatis-generator-config.xml"));

        DefaultShellCallback callback = new DefaultShellCallback(true);

        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);

        myBatisGenerator.generate(null);

        for (String warning : warnings) {

            System.out.println(warning);

        }

    }
}
