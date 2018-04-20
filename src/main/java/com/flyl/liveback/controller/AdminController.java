package com.flyl.liveback.controller;

import com.flyl.liveback.Pojo.FlyliveUser;
import com.flyl.liveback.common.Const;
import com.flyl.liveback.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@RestController
public class AdminController {

    private static Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    IUserService iUserService;

    @GetMapping("/")
    public ModelAndView index() {

        ModelAndView modelAndView = new ModelAndView();
        logger.info("-------------------get_login");
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @PostMapping("/login")
    public ModelAndView login(String number, String password, HttpSession session) {

        System.out.println(number + "------" + password);
        ModelAndView modelAndView = new ModelAndView();
        FlyliveUser user = new FlyliveUser();
        user.setPhone(number);
        user.setPassword(password);

        user = iUserService.selectBynNumberAndPassword(user);

        if (user != null) {
            session.setAttribute(Const.CURRENT_USER, user);
            modelAndView.setViewName("redirect:home");
        } else {
            modelAndView.setViewName("login");
        }

        return modelAndView;
    }

    @RequestMapping("/home")
    public ModelAndView home(HttpSession session) {
        FlyliveUser user = (FlyliveUser) session.getAttribute(Const.CURRENT_USER);
        ModelAndView modelAndView = new ModelAndView();

        if (user == null) {
            logger.info("未登陆");
            modelAndView.setViewName("redirect:/");
            return modelAndView;
        }

        modelAndView.setViewName("home");
        return modelAndView;

    }

    @RequestMapping("/welcome")
    public ModelAndView hello() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("welcome");
        return modelAndView;
    }

    @RequestMapping("/logout")
    public ModelAndView logint(HttpSession session) {
        session.removeAttribute(Const.CURRENT_USER);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        return modelAndView;
    }

    @GetMapping("/nav1_1")
    public ModelAndView nav1_1(HttpSession session) {
        FlyliveUser user = (FlyliveUser) session.getAttribute(Const.CURRENT_USER);
        ModelAndView modelAndView = new ModelAndView();

        if (user == null) {
            logger.info("未登陆");
            modelAndView.setViewName("redirect:/");
            return modelAndView;
        }
        modelAndView.setViewName("nav1_1");

        return modelAndView;
    }

    @GetMapping("/nav2_1")
    public ModelAndView nav2_1(HttpSession session) {
        FlyliveUser user = (FlyliveUser) session.getAttribute(Const.CURRENT_USER);
        ModelAndView modelAndView = new ModelAndView();

        if (user == null) {
            logger.info("未登陆");
            modelAndView.setViewName("redirect:/");
            return modelAndView;
        }
        modelAndView.setViewName("nav2_1");

        return modelAndView;
    }

}
