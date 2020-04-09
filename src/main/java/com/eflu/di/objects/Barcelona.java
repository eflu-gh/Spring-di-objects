package com.eflu.di.objects;

import org.springframework.beans.factory.annotation.Value;

public class Barcelona implements TeamSoccer {

	@Value("Barcelona")
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String showTeamSoccer() {

		return name;

	}

}
