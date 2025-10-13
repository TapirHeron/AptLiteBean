package com.tapirheron.spring.test.config;

import com.tapirheron.spring.framework.Componet;
import com.tapirheron.spring.framework.properties.Configuration;
import com.tapirheron.spring.framework.properties.ConfigurationProperties;
import com.tapirheron.spring.framework.properties.Value;
import lombok.Data;

@ConfigurationProperties(prefix = "my")
@Data
public class MyProperties {
    private String name;
    private String age;
}
