package com.design.prototype;

public class Sheep implements Cloneable{
	
	private String name;
	private int age;
	private String color;
	//private String address = "shenzhen";
	public Sheep friend;
	
	public Sheep(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}
	
	

	@Override
	public String toString() {
		return "Sheep [name=" + name + ", age=" + age + ", color=" + color + ", friend=" + friend + "]";
	}



	@Override
	protected Object clone(){
		Sheep sheep = null;
		try {
			sheep = (Sheep)super.clone();
		}catch (Exception e) {
			e.getMessage();
		}
		return sheep;
	}
	
	
}
