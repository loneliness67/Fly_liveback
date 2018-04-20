package com.flyl.liveback.service.Impl;

import com.flyl.liveback.Pojo.FlyliveUser;
import com.flyl.liveback.dao.FlyliveUserDao;
import com.flyl.liveback.service.IUserService;
import com.flyl.liveback.util.DateTimeUtil;
import com.flyl.liveback.util.MD5Util;
import com.flyl.liveback.vo.UserVo;
import com.google.common.collect.Lists;
import org.apache.catalina.User;
import org.beetl.sql.core.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    FlyliveUserDao flyliveUserDao;

    public FlyliveUser selectBynNumberAndPassword(FlyliveUser user) {

        user.setPassword(MD5Util.MD5EncodeUtf8(user.getPassword()));

        List<FlyliveUser> list = flyliveUserDao.template(user);

        if (list != null && list.size() >= 1) {
            user = list.get(0);
            if (user.getRole() == 1) {
                System.out.println(user.toString());
                return user;
            } else {
                logger.info("非管理员用户登陆");
                return null;
            }
        } else {
            return null;
        }

    }

    public List<UserVo> getAllVo() {

        List<FlyliveUser> list = flyliveUserDao.all();
        return this.UserToVo(list);
    }

    public List<UserVo> UserToVo(List<FlyliveUser> list) {
        List<UserVo> listVo = Lists.newArrayList();

        for (FlyliveUser user : list) {
            UserVo userVo = new UserVo();
            userVo.setId(user.getId());
            userVo.setLiveId(user.getLiveId());
            userVo.setRole(user.getRole());
            userVo.setSex((user.getSex()) == 0?"女":"男");
            userVo.setStatuc(user.getStatuc());
            userVo.setEmail(user.getEmail());
            userVo.setPhone(user.getPhone());
            userVo.setUsername(user.getUsername());
            userVo.setCreateTime(DateTimeUtil.dateToStr(user.getCreateTime(),"yyyy-MM-dd"));
            listVo.add(userVo);
        }

        return listVo;
    }


    public int changeStatuc(FlyliveUser flyliveUser) {
        return flyliveUserDao.updateTemplateById(flyliveUser);
    }

    public List<UserVo> searchUser(String user) {
        return this.UserToVo(flyliveUserDao.getLikeName(user));
    }




















}
