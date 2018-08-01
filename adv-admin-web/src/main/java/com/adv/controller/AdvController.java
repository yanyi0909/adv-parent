package com.adv.controller;

import com.adv.service.AdvAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("adv")
public class AdvController {

    @Autowired
    private AdvAdminService adminService;

    @RequestMapping("hello")
    public String hello() {
        return adminService.hell();
    }

    @RequestMapping("page")
    public ModelAndView page() {
        ModelAndView modelAndView = new ModelAndView("success");
        return modelAndView;
    }

    @RequestMapping(value = "do_page", method = RequestMethod.GET)
    public ModelAndView doPage() {
        ModelAndView modelAndView = new ModelAndView("adv/test");
        Map map = new HashMap<>();
        map.put("name", "admin");
        map.put("pwd", "123457");
        modelAndView.addObject(map);
        return modelAndView;
    }

    @GetMapping("/test")
    public ModelAndView welcome(Map<String, Object> model) {
        ModelAndView modelAndView = new ModelAndView("test");
        model.put("time", new Date());
        model.put("message", "hello word!");
        model.put("books", "books all");
        modelAndView.addObject(model);
        return modelAndView;
    }
}
