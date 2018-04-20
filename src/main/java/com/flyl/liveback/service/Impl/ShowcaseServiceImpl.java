package com.flyl.liveback.service.Impl;

import com.flyl.liveback.Pojo.FlyliveShowcase;
import com.flyl.liveback.dao.FlyliveShowcaseDao;
import com.flyl.liveback.service.IShowcaseService;
import com.flyl.liveback.util.DateTimeUtil;
import com.flyl.liveback.vo.ShowcaseVo;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowcaseServiceImpl implements IShowcaseService {

    @Autowired
    FlyliveShowcaseDao flyliveShowcaseDao;

    public List<ShowcaseVo> getShowcase() {
        List<FlyliveShowcase> list = flyliveShowcaseDao.all();
        return this.ShowcaseTovo(list);
    }


    //------------------转为  VO
    public  List<ShowcaseVo> ShowcaseTovo(List<FlyliveShowcase> list) {
        List<ShowcaseVo> listVo = Lists.newArrayList();


        for (FlyliveShowcase flyliveShowcase : list) {
            ShowcaseVo showcaseVo = new ShowcaseVo();
            showcaseVo.setId(flyliveShowcase.getId());
            showcaseVo.setLiveId(flyliveShowcase.getLiveId());
            showcaseVo.setUpdateTime(DateTimeUtil.dateToStr(flyliveShowcase.getUpdateTime(),"yyyy-MM-dd"));

            listVo.add(showcaseVo);
        }
        return listVo;
    }


    public int updateShowcase(FlyliveShowcase flyliveShowcase) {
        return flyliveShowcaseDao.updateTemplateById(flyliveShowcase);
    }














}
