package com.lqw.mybaits;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class MybatisGenerator {
    public static void main(String[] args) {
        try {
            String dir = "E:\\code\\project\\spring-boot-demos\\spring-boot-mybatis\\src\\main\\java";
            URL url = MybatisGenerator.class.getResource("/generatorConfig.xml");
            Properties properties = new Properties();
            properties.put("dir", dir);
            List<String> warnings = new ArrayList<>();
            boolean overwrite = true;
            ConfigurationParser cp = new ConfigurationParser(properties, warnings);
            Configuration config = cp.parseConfiguration(url.openStream());
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
