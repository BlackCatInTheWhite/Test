package com.aaa.springboot.dao;

import com.aaa.springboot.entity.Personinfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface PersonInfoMapper {
    List<Personinfo> findall();
}
