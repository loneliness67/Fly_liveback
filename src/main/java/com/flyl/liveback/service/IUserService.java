package com.flyl.liveback.service;

import com.flyl.liveback.Pojo.FlyliveUser;
import com.flyl.liveback.vo.UserVo;

import java.util.List;

public interface IUserService {
    FlyliveUser selectBynNumberAndPassword(FlyliveUser user);
    List<UserVo> getAllVo();
    int changeStatuc(FlyliveUser flyliveUser);
    List<UserVo> searchUser(String user);

}
