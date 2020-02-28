package com.clurgo.nanorent.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ={"com.clurgo.nanorent",} )
@EnableAutoConfiguration
public class NanoRentAutoConfiguration {
}
