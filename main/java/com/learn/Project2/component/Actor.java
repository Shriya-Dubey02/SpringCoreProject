package com.learn.Project2.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
	
	@Value("Stefan")
	private String fname;
	@Value("Salvatore")
	private String lname;
	@Value("M")
	private char gender;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Actor [fname=" + fname + ", lname=" + lname + ", gender=" + gender + "]";
	}
	public Actor(String fname, String lname, char gender) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
	}
	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
