package com.flyl.liveback.dao;
import org.beetl.sql.core.annotatoin.*;
import org.beetl.sql.core.mapper.BaseMapper;
import com.flyl.liveback.Pojo.*;

import java.util.List;

/*
* 
* gen by beetlsql mapper 2018-04-19
*/
public interface FlyliveUserDao extends BaseMapper<FlyliveUser> {

    @SqlStatement(params="username")
    List<FlyliveUser> getLikeName(String username);
}
