package com.learn.framework.bean;

import java.util.Date;

/**
 * Created by Administrator on 2017/4/17 0017.
 */
public class User {
    private String id;
    private String realName;
    private String loginName;
    private String idCard;
    private Boolean sex;
    private String typeId;
    private String typeName;
    private String roleId;
    private String roleName;
    private String tel;
    private String mobile;
    private Date loginTime;
    private Date birthday;
    private String deptId;
    private String deptName;
    private String email;
    private String qq;
    private String post;
    private String address;
    private Date createTime;
    private Date updateTime;
    private Boolean flag = true; //是否使用中
    private String createrId;
    private String updatorId;
    private String creatorName;
    private String updatorName;
    private String imageHead;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }


    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getCreaterId() {
        return createrId;
    }

    public void setCreaterId(String createrId) {
        this.createrId = createrId;
    }

    public String getUpdatorId() {
        return updatorId;
    }

    public void setUpdatorId(String updatorId) {
        this.updatorId = updatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getUpdatorName() {
        return updatorName;
    }

    public void setUpdatorName(String updatorName) {
        this.updatorName = updatorName;
    }

    public String getImageHead() {
        return imageHead;
    }

    public void setImageHead(String imageHead) {
        this.imageHead = imageHead;
    }

    public User(String id, String realName, String loginName, String idCard, Boolean sex, String typeId, String typeName, String roleId, String roleName, String tel, String mobile, Date loginTime, Date birthday, String deptId, String deptName, String email, String qq, String post, String address, Date createTime, Date updateTime, Boolean flag, String createrId, String updaterId, String creatorName, String updatorName, String imageHead) {
        this.id = id;
        this.realName = realName;
        this.loginName = loginName;
        this.idCard = idCard;
        this.sex = sex;
        this.typeId = typeId;
        this.typeName = typeName;
        this.roleId = roleId;
        this.roleName = roleName;
        this.tel = tel;
        this.mobile = mobile;
        this.loginTime = loginTime;
        this.birthday = birthday;
        this.deptId = deptId;
        this.deptName = deptName;
        this.email = email;
        this.qq = qq;
        this.post = post;
        this.address = address;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.flag = flag;
        this.createrId = createrId;
        this.updatorId = updatorId;
        this.creatorName = creatorName;
        this.updatorName = updatorName;
        this.imageHead = imageHead;
    }

}
