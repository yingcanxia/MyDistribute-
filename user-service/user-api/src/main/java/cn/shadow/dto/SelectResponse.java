package cn.shadow.dto;

import java.io.Serializable;

import cn.shadow.entity.User;

public class SelectResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
