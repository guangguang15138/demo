package com.example.aoplog.sbaop.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "dbone.druid.datasource")
public class DbOneDruidDataSourceProperties extends DruidDataSourceProperties{
}