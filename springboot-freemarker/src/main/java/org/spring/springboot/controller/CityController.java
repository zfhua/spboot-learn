package org.spring.springboot.controller;

import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 城市 Controller 实现 Restful HTTP 服务
 * <p>
 * Created by bysocket on 07/02/2017.
 */
@Controller
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/")
    @ResponseBody
    public String home(){
        return "hello";
    }

    // freeMarker 模板
    @RequestMapping(value = "/ftl", method = RequestMethod.GET)
    public String ftlDemo(Model model){
        City city = new City(333L, 3333L, "xxxx", "123");
        model.addAttribute("city", city);
        return "ftl";
    }

    // thymeleaf 模板
    @RequestMapping(value = "/thyme", method = RequestMethod.GET)
//    public String thymeleaf(Map<String, Object> map) {
    public String thymeleaf(Model model) {
        model.addAttribute("name", "model ooooo");
//        map.put("name","map ppppp");
        return "thymeleaf";
    }






//    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.GET)
//    public String findOneCity(Model model, @PathVariable("id") Long id) {
//        model.addAttribute("city", cityService.findCityById(id));
//        return "city";
//    }
//
}
