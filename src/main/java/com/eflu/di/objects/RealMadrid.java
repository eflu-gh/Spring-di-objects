package com.eflu.di.objects;

import org.springframework.beans.factory.annotation.Value;

public class RealMadrid implements TeamSoccer {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String showTeamSoccer() {
		// TODO Auto-generated method stub
		return name;
	}

}
