package org.itstep;

public class Student extends User{
	public Student(){
		
	}/// создание экземпляра класса без параметров
	public Student(String login, String pass, String name, String city){
	this.setLogin(login);
	this.setPass(pass);
	this.setName(name);
	this.setCity(city);
	}
}
