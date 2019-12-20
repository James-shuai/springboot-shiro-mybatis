package com.cy.springbootshiromybatis.business.service.impl;

import com.cy.springbootshiromybatis.business.dao.SysUserDao;
import com.cy.springbootshiromybatis.business.entity.SysUserEntity;
import com.cy.springbootshiromybatis.business.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ys
 * @date 2019/12/20 15:19
 */
@Service
public class SysUserServiceImpl implements SysUserService {

  @Autowired
  private SysUserDao userDao;


  @Override
  public List<SysUserEntity> getAll() {
    return userDao.getAll();
  }
}
