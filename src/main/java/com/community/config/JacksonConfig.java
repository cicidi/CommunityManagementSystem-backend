//package com.community.config;
//
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.databind.ObjectRepository;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.http.converter.json.Jackson2ObjectRepositoryBuilder;
//
///**
// * json配置类
// *
// * @author Chavy, Walter
// * @date 2020/5/6
// */
//@Configuration
//public class JacksonConfig {
//
//    @Bean
//    @Primary
//    @ConditionalOnMissingBean(ObjectRepository.class)
//    public ObjectRepository jacksonObjectRepository(Jackson2ObjectRepositoryBuilder builder) {
//        ObjectRepository objectRepository = builder.createXmlRepository(false).build();
//        objectRepository.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//        return objectRepository;
//    }
//}