package com.zebra.box.db.model;

import java.util.Date;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 */
public class ClxAboutMgt {

    /**
     * 关于我们管理表Id
     */
    private Integer mgtId;

    /**
     * 关于我们公司简介
     */
    private String mgtCompanydescribe;

    /**
     * 我们公司地址位置
     */
    private String mgtCompanyaddr;

    /**
     * 数据创建的创建时间
     */
    private Date createTime;

    /**
     * 创建人的账号
     */
    private String createUser;

    /**
     * 数据重新编辑后的更新时间
     */
    private Date updateTime;

    /**
     * 更新数据的更新人账号名
     */
    private String updateUser;

    /**
     * 是否删除,值0/1,0代表未删除1代表已删除
     */
    private String deleteFlag;

    /**
     * <pre>
     * 关于我们管理表Id
     * </pre>
     * 
     * @return the mgtId
     */
    public Integer getMgtId() {

        return mgtId;
    }

    /**
     * <pre>
     * 关于我们管理表Id
     * </pre>
     * 
     * @param mgtId the mgtId to set
     */
    public void setMgtId(Integer mgtId) {

        this.mgtId = mgtId;
    }

    /**
     * <pre>
     * 关于我们公司简介
     * </pre>
     * 
     * @return the mgtCompanydescribe
     */
    public String getMgtCompanydescribe() {

        return mgtCompanydescribe;
    }

    /**
     * <pre>
     * 关于我们公司简介
     * </pre>
     * 
     * @param mgtCompanydescribe the mgtCompanydescribe to set
     */
    public void setMgtCompanydescribe(String mgtCompanydescribe) {

        this.mgtCompanydescribe = mgtCompanydescribe;
    }

    /**
     * <pre>
     * 我们公司地址位置
     * </pre>
     * 
     * @return the mgtCompanyaddr
     */
    public String getMgtCompanyaddr() {

        return mgtCompanyaddr;
    }

    /**
     * <pre>
     * 我们公司地址位置
     * </pre>
     * 
     * @param mgtCompanyaddr the mgtCompanyaddr to set
     */
    public void setMgtCompanyaddr(String mgtCompanyaddr) {

        this.mgtCompanyaddr = mgtCompanyaddr;
    }

    /**
     * <pre>
     * 数据创建的创建时间
     * </pre>
     * 
     * @return the createTime
     */
    public Date getCreateTime() {

        return createTime;
    }

    /**
     * <pre>
     * 数据创建的创建时间
     * </pre>
     * 
     * @param createTime the createTime to set
     */
    public void setCreateTime(Date createTime) {

        this.createTime = createTime;
    }

    /**
     * <pre>
     * 创建人的账号
     * </pre>
     * 
     * @return the createUser
     */
    public String getCreateUser() {

        return createUser;
    }

    /**
     * <pre>
     * 创建人的账号
     * </pre>
     * 
     * @param createUser the createUser to set
     */
    public void setCreateUser(String createUser) {

        this.createUser = createUser;
    }

    /**
     * <pre>
     * 数据重新编辑后的更新时间
     * </pre>
     * 
     * @return the updateTime
     */
    public Date getUpdateTime() {

        return updateTime;
    }

    /**
     * <pre>
     * 数据重新编辑后的更新时间
     * </pre>
     * 
     * @param updateTime the updateTime to set
     */
    public void setUpdateTime(Date updateTime) {

        this.updateTime = updateTime;
    }

    /**
     * <pre>
     * 更新数据的更新人账号名
     * </pre>
     * 
     * @return the updateUser
     */
    public String getUpdateUser() {

        return updateUser;
    }

    /**
     * <pre>
     * 更新数据的更新人账号名
     * </pre>
     * 
     * @param updateUser the updateUser to set
     */
    public void setUpdateUser(String updateUser) {

        this.updateUser = updateUser;
    }

    /**
     * <pre>
     * 是否删除,值0/1,0代表未删除1代表已删除
     * </pre>
     * 
     * @return the deleteFlag
     */
    public String getDeleteFlag() {

        return deleteFlag;
    }

    /**
     * <pre>
     * 是否删除,值0/1,0代表未删除1代表已删除
     * </pre>
     * 
     * @param deleteFlag the deleteFlag to set
     */
    public void setDeleteFlag(String deleteFlag) {

        this.deleteFlag = deleteFlag;
    }
}
