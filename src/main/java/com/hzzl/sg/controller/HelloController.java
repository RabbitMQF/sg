package com.hzzl.sg.controller;

import com.hzzl.sg.model.Flight;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Program: SG
 * @Description: ${description}
 * @Author: MaQingFu
 * @Date: 2018/7/26 15:22
 **/
@RestController
@RequestMapping("/api/sg/hello")
public class HelloController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void hello() {
        Flight flight = new Flight();

        System.out.println("rest接口测试成功");
    }
}
