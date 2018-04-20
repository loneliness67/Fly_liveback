package com.flyl.liveback.controller;


import com.flyl.liveback.Pojo.FlyliveShowcase;
import com.flyl.liveback.Pojo.FlyliveUser;
import com.flyl.liveback.common.Const;
import com.flyl.liveback.service.IShowcaseService;
import com.flyl.liveback.service.IUserService;
import com.flyl.liveback.vo.ShowcaseVo;
import com.flyl.liveback.vo.UserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class TableController {

    private static Logger logger = LoggerFactory.getLogger(TableController.class);

    @Autowired
    IShowcaseService iShowcaseService;

    @Autowired
    IUserService iUserService;

    @RequestMapping("/nav11")
    public List<ShowcaseVo> getNav11(HttpSession session) {
        FlyliveUser user = (FlyliveUser) session.getAttribute(Const.CURRENT_USER);


        if (user == null) {
            logger.info("未登陆");
            return null;
        }
        return iShowcaseService.getShowcase();

    }

    @RequestMapping("/updateshowcase")
    public String updateShowcase(Integer id, Integer liveId, HttpSession session) {
        FlyliveUser user = (FlyliveUser) session.getAttribute(Const.CURRENT_USER);


        if (user == null) {
            logger.info("未登陆");
            return null;
        }

        FlyliveShowcase flyliveShowcase = new FlyliveShowcase();
        flyliveShowcase.setId(id);
        flyliveShowcase.setLiveId(liveId);

        int resultCount = iShowcaseService.updateShowcase(flyliveShowcase);

        if (resultCount > 0) {
            return "SUCCESS";
        } else {
            return "ERROR";
        }
    }

    @RequestMapping("/nav21")
    public List<UserVo> getNav21(HttpSession session) {
        FlyliveUser user = (FlyliveUser) session.getAttribute(Const.CURRENT_USER);


        if (user == null) {
            logger.info("未登陆");
            return null;
        }
        return iUserService.getAllVo();
    }

    @RequestMapping("/changeStatuc")
    public String changeStatuc(Integer id, Integer statuc,HttpSession session) {
        FlyliveUser user = (FlyliveUser) session.getAttribute(Const.CURRENT_USER);


        if (user == null) {
            logger.info("未登陆");
            return null;
        }

        FlyliveUser flyliveUser = new FlyliveUser();

        flyliveUser.setId(id);
        flyliveUser.setStatuc(statuc);

        int resultCount = iUserService.changeStatuc(flyliveUser);


        if (resultCount > 0) {
            return "ERROR";
        } else {
            return "SUCCESS";
        }

    }

    @RequestMapping("/searchuser")
    public List<UserVo> searchUser(String name,HttpSession session) {
        FlyliveUser user = (FlyliveUser) session.getAttribute(Const.CURRENT_USER);


        if (user == null) {
            logger.info("未登陆");
            return null;
        }


        return iUserService.searchUser(name);
    }
}
