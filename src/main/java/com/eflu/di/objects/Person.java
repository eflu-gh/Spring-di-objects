package com.eflu.di.objects;

import org.springframework.stereotype.Component;

@Component
public class Person {

	private int id;
	private String name;
	private String nickName;
	private Country country;
	private TeamSoccer team;

	public TeamSoccer getTeam() {
		return team;
	}

	public void setTeam(TeamSoccer team) {
		this.team = team;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

}
