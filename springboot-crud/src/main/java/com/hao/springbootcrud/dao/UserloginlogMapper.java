package com.hao.springbootcrud.dao;

import com.hao.springbootcrud.entities.Userloginlog;
import org.springframework.stereotype.Repository;

@Repository
public interface UserloginlogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Userloginlog record);

    int insertSelective(Userloginlog record);

    Userloginlog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userloginlog record);

    int updateByPrimaryKey(Userloginlog record);

    Userloginlog selectByPrimaryKey2(int i);

    Userloginlog selectByPrimaryKey3(int i);
}