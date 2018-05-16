package com.aida.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.ctrip.platform.dal.dao.annotation.Database;
import com.ctrip.platform.dal.dao.annotation.Sensitive;
import com.ctrip.platform.dal.dao.annotation.Type;
import java.sql.Types;
import java.sql.Timestamp;

import com.ctrip.platform.dal.dao.DalPojo;

@Entity
@Database(name="AIDA")
@Table(name="tb_menu")
public class Menu implements DalPojo {

	@Id
	@Column(name="MenuID")
	@Type(value=Types.VARCHAR)
	private String menuID;

	@Column(name="ParentMenuID")
	@Type(value=Types.VARCHAR)
	private String parentMenuID;

	@Column(name="Title")
	@Type(value=Types.VARCHAR)
	private String title;

	@Column(name="ShowIndex")
	@Type(value=Types.INTEGER)
	private Integer showIndex;

	@Column(name="SystemType")
	@Type(value=Types.INTEGER)
	private Integer systemType;

	@Column(name="Url")
	@Type(value=Types.VARCHAR)
	private String url;

	@Column(name="IdName")
	@Type(value=Types.VARCHAR)
	private String idName;

	@Column(name="ClassName")
	@Type(value=Types.VARCHAR)
	private String className;

	@Column(name="MenuType")
	@Type(value=Types.INTEGER)
	private Integer menuType;

	@Column(name="NotifyInfo")
	@Type(value=Types.VARCHAR)
	private String notifyInfo;

	@Column(name="ClassofNotify")
	@Type(value=Types.VARCHAR)
	private String classofNotify;

	@Column(name="Imageurl")
	@Type(value=Types.VARCHAR)
	private String imageurl;

	@Column(name="IsDefaultOpen")
	@Type(value=Types.BIT)
	private byte[] isDefaultOpen;

	@Column(name="Enabled")
	@Type(value=Types.BIT)
	private byte[] enabled;

	@Column(name="CreationUserID")
	@Type(value=Types.VARCHAR)
	private String creationUserID;

	@Column(name="CreationTime")
	@Type(value=Types.TIMESTAMP)
	private Timestamp creationTime;

	@Column(name="Remark")
	@Type(value=Types.VARCHAR)
	private String remark;

	public String getMenuID() {
		return menuID;
	}

	public void setMenuID(String menuID) {
		this.menuID = menuID;
	}

	public String getParentMenuID() {
		return parentMenuID;
	}

	public void setParentMenuID(String parentMenuID) {
		this.parentMenuID = parentMenuID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getShowIndex() {
		return showIndex;
	}

	public void setShowIndex(Integer showIndex) {
		this.showIndex = showIndex;
	}

	public Integer getSystemType() {
		return systemType;
	}

	public void setSystemType(Integer systemType) {
		this.systemType = systemType;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIdName() {
		return idName;
	}

	public void setIdName(String idName) {
		this.idName = idName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Integer getMenuType() {
		return menuType;
	}

	public void setMenuType(Integer menuType) {
		this.menuType = menuType;
	}

	public String getNotifyInfo() {
		return notifyInfo;
	}

	public void setNotifyInfo(String notifyInfo) {
		this.notifyInfo = notifyInfo;
	}

	public String getClassofNotify() {
		return classofNotify;
	}

	public void setClassofNotify(String classofNotify) {
		this.classofNotify = classofNotify;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public byte[] getIsDefaultOpen() {
		return isDefaultOpen;
	}

	public void setIsDefaultOpen(byte[] isDefaultOpen) {
		this.isDefaultOpen = isDefaultOpen;
	}

	public byte[] getEnabled() {
		return enabled;
	}

	public void setEnabled(byte[] enabled) {
		this.enabled = enabled;
	}

	public String getCreationUserID() {
		return creationUserID;
	}

	public void setCreationUserID(String creationUserID) {
		this.creationUserID = creationUserID;
	}

	public Timestamp getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Timestamp creationTime) {
		this.creationTime = creationTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}