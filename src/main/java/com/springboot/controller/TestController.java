package com.springboot.controller;

import com.springboot.common.KafkaSender;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bengda
 */
@RestController
@RequestMapping("test/")
@Slf4j
@Api(tags = "测试swagger接口")
public class TestController {

    @Autowired
    private KafkaSender kafkaSender;


    @ApiOperation("测试")
    @GetMapping("demo")
    public String test(){
        System.out.println("helloworld");
        return "helloworld";
    }

    @GetMapping("sendMessage/{msg}")
    public void sendMessage(@PathVariable("msg") String msg){
        kafkaSender.send(msg);
    }

}
