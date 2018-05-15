package com.aida.dto.basic;

import java.sql.Date;
import java.sql.Timestamp;

public class BaseSaveRequest {
	
    private String creationUserId;
   
    private String modifyUserId;
    
    private Timestamp creationTime;
    
    private Timestamp modifyTime;
    
	public String getCreationUserId() {
		return creationUserId;
	}
	
	public void setCreationUserId(String creationUserId) {
		this.creationUserId = creationUserId;
	}

	public String getModifyUserId() {
		return modifyUserId;
	}

	public void setModifyUserId(String modifyUserId) {
		this.modifyUserId = modifyUserId;
	}

	public Timestamp getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Timestamp creationTime) {
		this.creationTime = creationTime;
	}

	public Timestamp getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}
}
