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

import com.ctrip.platform.dal.dao.DalPojo;

@Entity
@Database(name="AIDA Project")
@Table(name="tb_rolemenurelation")
public class Rolemenurelation implements DalPojo {

	@Id
	@Column(name="RMRelationID")
	@Type(value=Types.VARCHAR)
	private String rMRelationID;

	@Column(name="MenuID")
	@Type(value=Types.VARCHAR)
	private String menuID;

	@Column(name="RoleID")
	@Type(value=Types.VARCHAR)
	private String roleID;

	@Column(name="FuncIDs")
	@Type(value=Types.VARCHAR)
	private String funcIDs;

	public String getRMRelationID() {
		return rMRelationID;
	}

	public void setRMRelationID(String rMRelationID) {
		this.rMRelationID = rMRelationID;
	}

	public String getMenuID() {
		return menuID;
	}

	public void setMenuID(String menuID) {
		this.menuID = menuID;
	}

	public String getRoleID() {
		return roleID;
	}

	public void setRoleID(String roleID) {
		this.roleID = roleID;
	}

	public String getFuncIDs() {
		return funcIDs;
	}

	public void setFuncIDs(String funcIDs) {
		this.funcIDs = funcIDs;
	}

}