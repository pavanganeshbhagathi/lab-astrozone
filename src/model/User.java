package model;

import java.time.LocalDate;

public class User
{
  private	String name;

  private   LocalDate dob;
  private  String gender;
  
  
public User(String name, LocalDate dob, String gender) {
	super();
	this.name = name;
	this.dob = dob;
	this.gender = gender;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "User [name=" + name + ", dob=" + dob + ", gender=" + gender + "]";
}
  
  
  
}