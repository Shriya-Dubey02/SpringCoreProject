package com.learn.Project2.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Movie {
	private int mov_id;
	private String mov_name;
	private int year;
	private String language;
	private int time;
	
	@Autowired
	@Qualifier("a1")
	private Actor actor;
	public Movie(int mov_id, String mov_name, int year, String language, int time, Actor actor) {
		super();
		this.mov_id = mov_id;
		this.mov_name = mov_name;
		this.year = year;
		this.language = language;
		this.time = time;
		this.actor = actor;
	}
	public Actor getActor() {
		return actor;
	}
	public void setActor(Actor actor) {
		this.actor = actor;
	}
	public int getMov_id() {
		return mov_id;
	}
	public void setMov_id(int mov_id) {
		this.mov_id = mov_id;
	}
	public String getMov_name() {
		return mov_name;
	}
	public void setMov_name(String mov_name) {
		this.mov_name = mov_name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Movie [mov_id=" + mov_id + ", mov_name=" + mov_name + ", year=" + year + ", language=" + language
				+ ", time=" + time + ", actor=" + actor + "]";
	}
	public Movie(int mov_id, String mov_name, int year, String language, int time) {
		super();
		this.mov_id = mov_id;
		this.mov_name = mov_name;
		this.year = year;
		this.language = language;
		this.time = time;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
