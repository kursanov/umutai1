package com.peaksoft.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages="com.peaksoft")
@PropertySource("classpath:application.properties")
public class MyConfig {
}
