package com.flyl.liveback.service;

import com.flyl.liveback.Pojo.FlyliveShowcase;
import com.flyl.liveback.vo.ShowcaseVo;

import java.util.List;

public interface IShowcaseService {
    List<ShowcaseVo> getShowcase();
    int updateShowcase(FlyliveShowcase flyliveShowcase);

}
