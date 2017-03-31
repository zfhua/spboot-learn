package org.spring.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * redis 缓存
 *
 * Created by Administrator on 2017/3/31.
 */
@Controller
@RequestMapping("/redis")
public class RedisController {

    //

    @RequestMapping("/test1")
    public String redis1(){
        //
        return "view1";
    }


}
