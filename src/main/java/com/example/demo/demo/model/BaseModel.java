package com.example.demo.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseModel implements Serializable {
    private static final long serialVersionUID = -8347903402016396276L;
    private Date time;
    
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
    
}
