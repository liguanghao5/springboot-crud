package com.hao.springbootcrud.dao;

import com.hao.springbootcrud.entities.Userlogin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserloginMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Userlogin record);

    int insertSelective(Userlogin record);

    Userlogin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userlogin record);

    int updateByPrimaryKey(Userlogin record);
}