package com.ronakstudy.model;

import org.springframework.stereotype.Component;

@Component
public class CoreTeamMembers {

	private int teamMemId;
	private String teamMemName;
	private String teamMemDesig;
	public int getTeamMemId() {
		return teamMemId;
	}
	public void setTeamMemId(int teamMemId) {
		this.teamMemId = teamMemId;
	}
	public String getTeamMemName() {
		return teamMemName;
	}
	public void setTeamMemName(String teamMemName) {
		this.teamMemName = teamMemName;
	}
	public String getTeamMemDesig() {
		return teamMemDesig;
	}
	public void setTeamMemDesig(String teamMemDesig) {
		this.teamMemDesig = teamMemDesig;
	}
	public CoreTeamMembers() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
}
