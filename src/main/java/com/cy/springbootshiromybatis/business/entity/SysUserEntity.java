package com.cy.springbootshiromybatis.business.entity;

import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

/**
 * @author ys
 * @date 2019/12/20 15:12
 */
@Table(name = "sys_user")
public class SysUserEntity {
  private int id;
  private String username;
  private String password;
  private String actualName;
  private String mailbox;
  private String phone;
  private Date createTime;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getActualName() {
    return actualName;
  }

  public void setActualName(String actualName) {
    this.actualName = actualName;
  }

  public String getMailbox() {
    return mailbox;
  }

  public void setMailbox(String mailbox) {
    this.mailbox = mailbox;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SysUserEntity that = (SysUserEntity) o;
    return id == that.id &&
      Objects.equals(username, that.username) &&
      Objects.equals(password, that.password) &&
      Objects.equals(actualName, that.actualName) &&
      Objects.equals(mailbox, that.mailbox) &&
      Objects.equals(phone, that.phone) &&
      Objects.equals(createTime, that.createTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, password, actualName, mailbox, phone, createTime);
  }
}
