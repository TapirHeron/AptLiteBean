package com.tapirheron.spring.test.config;

import com.tapirheron.spring.dao.MySqlSessionFactory;
import com.tapirheron.spring.framework.ApplicationContext;
import com.tapirheron.spring.framework.Autowired;
import com.tapirheron.spring.framework.Bean;
import com.tapirheron.spring.framework.properties.Configuration;
import com.tapirheron.spring.framework.properties.EnableConfigurationProperties;


/**
 * @author TapirHeron
 * 添加第三方类注册为bean
 */
@Configuration
@EnableConfigurationProperties({MyProperties.class, MySecondProperties.class})
public class TestConfig {

    @Autowired
    private ApplicationContext applicationContext;

    @Bean("testBean")
    public String testBean() {
        return "test value";
    }
    @Bean
    public String testBean2() {
        return "test value2";
    }

    @Bean("testProperties")
    public String testProperties(MyProperties myProperties) {
        return myProperties.getName();
    }
    @Bean("2")
    public String testSecondProperties(MySecondProperties mySecondProperties) {
        System.out.println(mySecondProperties.getName());
        return mySecondProperties.getName();
    }
}
