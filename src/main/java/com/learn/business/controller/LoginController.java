package com.learn.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/4/24 0024.
 */
@RequestMapping("/login")
@Controller
public class LoginController {

    @RequestMapping("/loginPage")
    public ModelAndView toLogin(){
        ModelAndView mv = new ModelAndView();
         mv.setViewName("/frameworks/login/login");
        return mv;
    }
}
