package com.flyl.liveback;

import org.beetl.sql.core.*;
import org.beetl.sql.core.db.DBStyle;
import org.beetl.sql.core.db.MySqlStyle;
import org.beetl.sql.ext.DebugInterceptor;
import org.beetl.sql.ext.gen.GenConfig;
import org.beetl.sql.ext.gen.MapperCodeGen;

public class Autogeneration {

    public static void main(String[] args) throws Exception {


//        ConnectionSource source = ConnectionSourceHelper.getSimple("com.mysql.jdbc.Driver", "jdbc:mysql://qdm16239399.my3w.com/qdm16239399_db", "qdm16239399", "Wwaacc11");
//        DBStyle mysql = new MySqlStyle();
//        // sql语句放在classpagth的/sql 目录下
//        SQLLoader loader = new ClasspathLoader("/sql");
//        // 数据库命名跟java命名一样，所以采用DefaultNameConversion，还有一个是UnderlinedNameConversion，下划线风格的，
//        UnderlinedNameConversion nc = new  UnderlinedNameConversion();
//        // 最后，创建一个SQLManager,DebugInterceptor 不是必须的，但可以通过它查看sql执行情况
//        SQLManager sqlManager = new SQLManager(mysql,loader,source,nc,new Interceptor[]{new DebugInterceptor()});
//
////        sqlManager.genPojoCodeToConsole("flylive_user");
////        sqlManager.genSQLTemplateToConsole("flylive_user");
//        GenConfig config = new GenConfig();
//        config.preferBigDecimal(true);
//
//        MapperCodeGen mapper = new MapperCodeGen("com.flyl.liveback.dao");
//        config.codeGens.add(mapper);
//
//        sqlManager.genPojoCode("flylive_user","com.flyl.liveback.Pojo",config);
//        sqlManager.genSQLFile("flylive_user");
//
//        sqlManager.genPojoCode("flylive_showcase","com.flyl.liveback.Pojo",config);
//        sqlManager.genSQLFile("flylive_showcase");
//
//        sqlManager.genPojoCode("flylive_live","com.flyl.liveback.Pojo",config);
//        sqlManager.genSQLFile("flylive_live");
//
//        sqlManager.genPojoCode("flylive_category","com.flyl.liveback.Pojo",config);
//        sqlManager.genSQLFile("flylive_category");

    }




}
