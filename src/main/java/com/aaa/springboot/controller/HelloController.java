package com.aaa.springboot.controller;

import com.aaa.springboot.entity.Personinfo;
import com.aaa.springboot.service.IPersoninfoBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class HelloController {
    @Autowired
    private IPersoninfoBiz iPersoninfoBiz;

//    @RequestMapping("/")
//    @ResponseBody
//    public List<Personinfo> tohello() {
//        final List<Personinfo> findall = iPersoninfoBiz.findall();
//        return findall;
//
//    }
    @RequestMapping("/findall")

    public String findall(HttpServletRequest req){
        List<Personinfo> personlist = iPersoninfoBiz.findall();
        req.setAttribute("personlist",personlist);
            return "hellomybatis";

        }
}
