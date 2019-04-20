package com.aaa.springboot.service;

import com.aaa.springboot.dao.GoodsMapper;
import com.aaa.springboot.entity.Goodsinfo;
import com.aaa.springboot.entity.Typeinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsBizImp implements GoodsBiz {



    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goodsinfo> findallGoods() {
        return goodsMapper.findallGoods();
    }
    @Override
    public Goodsinfo findone(Integer goodsid) {
        return goodsMapper.findone(goodsid);
    }

    @Override
    public List<Typeinfo> findtype() {
        return goodsMapper.findtype();
    }

    @Override
    public int update(Goodsinfo goods) {
        return goodsMapper.update(goods);
    }
}
