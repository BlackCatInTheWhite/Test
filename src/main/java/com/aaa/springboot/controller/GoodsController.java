package com.aaa.springboot.controller;

import com.aaa.springboot.entity.Goodsinfo;
import com.aaa.springboot.entity.Typeinfo;
import com.aaa.springboot.service.GoodsBiz;
import com.aaa.springboot.service.GoodsBizImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class GoodsController {
@Autowired
    private GoodsBizImp goodsBiz;

@RequestMapping("/showall")
    public String showall(HttpServletRequest req){
    System.out.println(1);
    List<Goodsinfo> goodsinfos = goodsBiz.findallGoods();
    System.out.println(goodsinfos);
    req.setAttribute("goodslist",goodsinfos);
    System.out.println(goodsBiz.findallGoods());
        return "showall";
    }
    @RequestMapping("/showone")
    public String showone(HttpServletRequest req, @RequestParam(value="goodsid")int goodsid){

        Goodsinfo goods = goodsBiz.findone(goodsid);
        List<Typeinfo> findtype = goodsBiz.findtype();
        req.setAttribute("goods",goods);
        req.setAttribute("findtype",findtype);
        return "showone";
    }
    @RequestMapping("/update")
    public String update(HttpServletRequest req, Goodsinfo goodsinfo){
        System.out.println(goodsinfo.getGoodsname());
        int update = goodsBiz.update(goodsinfo);
        req.setAttribute("goodslist",goodsBiz.findallGoods());
        return "showall";
    }
}
