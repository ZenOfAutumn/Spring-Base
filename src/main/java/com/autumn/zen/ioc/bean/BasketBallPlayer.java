package com.autumn.zen.ioc.bean;

public class BasketBallPlayer {
	
	// for cascade insert
	private Person person = new Person();
	
	private String team;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "BasketBallPlayer [person=" + person + ", team=" + team + "]";
	}
	
	
	
	

}
