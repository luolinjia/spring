package com.test.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.model.LoginForm;

@Controller
public class LoginController {
	@RequestMapping(value="login")
    public ModelAndView login(HttpServletRequest request,HttpServletResponse response,LoginForm loginForm ){
        String username = loginForm.getUsername();
        ModelAndView mv = new ModelAndView("/index/index");
        mv.addObject("loginForm", username);
        mv.addObject("param1", "Hello!");
        mv.addObject("param2", "administrator");
        
        return mv;
    }
}
