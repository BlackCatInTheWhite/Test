package com.aaa.springboot.service;

import com.aaa.springboot.entity.Goodsinfo;
import com.aaa.springboot.entity.Typeinfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;


public interface GoodsBiz {
    List<Goodsinfo> findallGoods();

    List<Typeinfo> findtype();

    int update(Goodsinfo goods);

    Goodsinfo findone(Integer goodsid);
}