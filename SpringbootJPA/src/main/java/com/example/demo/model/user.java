package com.example.demo.model;

public class user {
private int id;
private String name;







@Override
public String toString() {
	return "user [id=" + id + ", name=" + name + "]";
}
public user() {
	super();
}
public user(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}





}
