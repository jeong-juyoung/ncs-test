package com.greedy.ncs.member.model.dto;

public class MemberDTO {
	
	private int Number; // 회원번호 
	private String id;   // 아이디 
	private String pwd;  // 비밀번호
	private String name; // 회원이름
	private String date; // 가입일
	private double height; // 키
	private double weight; // 몸무게
	private String yesno; // 활성화유무
	
	
	public MemberDTO() {}


	public int getNumber() {
		return Number;
	}


	public void setNumber(int number) {
		 this.Number = number;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String getYesno() {
		return yesno;
	}


	public void setYesno(String yesno) {
		this.yesno = yesno;
	}
	
	public String getInformation() {
		
		return "Number =" + Number + "id = " + id + "pwd =" + pwd + "name =" + name + 
				"date =" + date + "height =" + height + "weight =" + weight + "yesno =" + yesno;
				
	}
	 
	

	
	
}
