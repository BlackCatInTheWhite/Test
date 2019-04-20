package com.aaa.springboot.dao;

import com.aaa.springboot.entity.Goodsinfo;
import com.aaa.springboot.entity.Typeinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface GoodsMapper {
    List<Goodsinfo> findallGoods();

    List<Typeinfo> findtype();

    int update(Goodsinfo goods);

    Goodsinfo findone(@Param("goodsid")Integer goodsid);
}
