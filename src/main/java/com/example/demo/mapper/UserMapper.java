package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface UserMapper extends BaseMapper<User> {
    List<User> findAll();
    IPage<User> selectPageVo(Page<?> page);
}
