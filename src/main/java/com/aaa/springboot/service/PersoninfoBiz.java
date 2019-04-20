package com.aaa.springboot.service;

import com.aaa.springboot.dao.PersonInfoMapper;
import com.aaa.springboot.entity.Personinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Service
public class PersoninfoBiz implements  IPersoninfoBiz {

//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @Override
//    public List<Personinfo> findall(){
//        List<Personinfo> personinfoList=jdbcTemplate.query("select personname,personage,personaddress from personinfo", new RowMapper<Personinfo>() {
//            @Override
//            public Personinfo mapRow(ResultSet resultSet, int i) throws SQLException {
//                Personinfo per=new Personinfo();
//                per.setPersonname(resultSet.getString("personname"));
//                per.setPersonaddress(resultSet.getString("personaddress"));
//                per.setPersonage(resultSet.getInt("personage"));
//                    return per;
//            }
//        });
//        return personinfoList;
//    }
    @Autowired
    private PersonInfoMapper iPersoninfoBiz;

    @Override
    public List<Personinfo> findall(){
        return iPersoninfoBiz.findall();
    }
}
