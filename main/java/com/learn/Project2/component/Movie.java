package com.learn.Project2.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Movie {
	@Value("101")
	private int mov_id;
	@Value("Vampire Diaries")
	private String title;
	@Value("2014")
	private int mov_year;
	@Value("English")
	private String mov_language;
	// @Autowired
	@Value("Damon Salvatore")
	private String actors_name;
	
	//@Autowired
	private Actor actor;
	
	
	
	
	public Actor getActor() {
		return actor;
	}
	@Autowired
	public void setActor(Actor actor) {
		System.out.println("Setter Methods");
		this.actor = actor;
	}
	public int getMov_id() {
		return mov_id;
	}
	public void setMov_id(int mov_id) {
		this.mov_id = mov_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getMov_year() {
		return mov_year;
	}
	public void setMov_year(int mov_year) {
		this.mov_year = mov_year;
	}
	public String getMov_language() {
		return mov_language;
	}
	public void setMov_language(String mov_language) {
		this.mov_language = mov_language;
	}
	public String getActors_name() {
		return actors_name;
	}
	public void setActors_name(String actors_name) {
		this.actors_name = actors_name;
	}
	@Override
	public String toString() {
		return "Movie [mov_id=" + mov_id + ", title=" + title + ", mov_year=" + mov_year + ", mov_language="
				+ mov_language + ", actors_name=" + actors_name + ", actor=" + actor + "]";
	}
	public Movie(int mov_id, String title, int mov_year, String mov_language, String actors_name) {
		super();
		this.mov_id = mov_id;
		this.title = title;
		this.mov_year = mov_year;
		this.mov_language = mov_language;
		this.actors_name = actors_name;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
