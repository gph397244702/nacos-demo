package com.xiaogao.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 *
 * @author xiaog
 * @date 2020-01-20 10:15
 */
@RestController
public class ProviderController {

    @Value("${providerName}")
    private String name;

    @GetMapping("send")
    public String send(){
        return name;
    }
}