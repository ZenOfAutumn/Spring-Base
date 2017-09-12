package com.autumn.zen.ioc.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Team {

	private List<BasketBallPlayer> players;
	
	private Set<String> years;
	
	private Map<String,BasketBallPlayer> mvpEveryYear;
	
	private Properties playersPhone;
	
	public List<BasketBallPlayer> getPlayers() {
		return players;
	}
	
	public void setPlayers(List<BasketBallPlayer> players) {
		this.players = players;
	}
	
	public void setYears(Set<String> years) {
		this.years = years;
	}
	
	public Set<String> getYears() {
		return years;
	}
	
	public void setMvpEveryYear(Map<String, BasketBallPlayer> mvpEveryYear) {
		this.mvpEveryYear = mvpEveryYear;
	}
	
	public Map<String, BasketBallPlayer> getMvpEveryYear() {
		return mvpEveryYear;
	}
	
	public void setPlayersPhone(Properties playersPhone) {
		this.playersPhone = playersPhone;
	}
	
	public Properties getPlayersPhone() {
		return playersPhone;
	}
	
	
	
	
}
