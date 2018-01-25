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
@Table(name="tb_role")
public class Role implements DalPojo {

	@Id
	@Column(name="RoleID")
	@Type(value=Types.VARCHAR)
	private String roleID;

	@Column(name="RoleName")
	@Type(value=Types.VARCHAR)
	private String roleName;

	@Column(name="Enable")
	@Type(value=Types.BIT)
	private byte[] enable;

	@Column(name="CreationUserID")
	@Type(value=Types.VARCHAR)
	private String creationUserID;

	@Column(name="CreationTime")
	@Type(value=Types.TIMESTAMP)
	private Timestamp creationTime;

	@Column(name="Remark")
	@Type(value=Types.VARCHAR)
	private String remark;

	public String getRoleID() {
		return roleID;
	}

	public void setRoleID(String roleID) {
		this.roleID = roleID;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public byte[] getEnable() {
		return enable;
	}

	public void setEnable(byte[] enable) {
		this.enable = enable;
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