package com.cy.springbootshiromybatis.business.controller;

import com.cy.springbootshiromybatis.business.entity.SysUserEntity;
import com.cy.springbootshiromybatis.business.service.SysUserService;
import com.cy.springbootshiromybatis.common.utils.ReturnResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ys
 * @date 2019/12/20 15:21
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {


  @Autowired
  private SysUserService userService;

  /**
   * 查询所有用户
   * @return
   */
  @RequestMapping("/getAll")
  public Object getAll(){
    List<SysUserEntity> all = userService.getAll();
      return ReturnResult.successResult("",all);
  }


}
