package com.cy.springbootshiromybatis.business.dao;

import com.cy.springbootshiromybatis.business.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ys
 * @date 2019/12/20 15:08
 */
@Mapper
@Component
public interface SysUserDao {

  //查找所有用户
  List<SysUserEntity> getAll();



}
