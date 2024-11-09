package com.learn.Project2.bean;

public class Actor {
	private int act_id;
	private String fname;
	private String lname;
	private char gender;
	public int getAct_id() {
		return act_id;
	}
	public void setAct_id(int act_id) {
		this.act_id = act_id;
	}
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
		return "Actor [act_id=" + act_id + ", fname=" + fname + ", lname=" + lname + ", gender=" + gender + "]";
	}
	public Actor(int act_id, String fname, String lname, char gender) {
		super();
		this.act_id = act_id;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
	}
	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
