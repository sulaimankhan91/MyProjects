package com.mywebservice.com.response;

import java.io.Serializable;

public class Response implements Serializable{
private String name;
private String id;
private String body;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getBody() {
	return body;
}
public void setBody(String body) {
	this.body = body;
}

}
