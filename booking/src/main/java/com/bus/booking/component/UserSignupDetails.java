package com.bus.booking.component;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
public class UserSignupDetails {
@NotEmpty(message="first name should not be empty")
public String firstname;
@NotEmpty(message="last name should not be empty")
public String lastname;
@NotNull(message="please enter age")
public Integer age;
@NotEmpty(message="please select gender")
public String gender;
@NotNull(message="please enter valid mobile number")
@Min(value=7)
public Integer mobile;
@NotEmpty(message="please select state")
public  String state;
@NotEmpty(message="please select country")
public String country;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Integer getMobile() {
	return mobile;
}
public void setMobile(Integer mobile) {
	this.mobile = mobile;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}


}
