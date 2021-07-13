package coreservlets;

import java.util.ArrayList;

public class modifyBean {
private String timeinhour;
private String timeinmin;
private String timeinseconds;
private ArrayList<String> test;
private String day;
private String month;
private String year;

private String tempemplid;








public String getTempemplid() {
	return tempemplid;
}






public void setTempemplid(String tempemplid) {
	this.tempemplid = tempemplid;
}






public String getDay() {
	return day;
}






public void setDay(String day) {
	this.day = day;
}






public String getMonth() {
	return month;
}






public void setMonth(String month) {
	this.month = month;
}






public String getYear() {
	return year;
}






public void setYear(String year) {
	this.year = year;
}






public String getTest() {
	String outStr="";
	for (String s: test)
		outStr = outStr + s;
	return outStr;
}






public void setTest(ArrayList<String> test) {
	this.test = test;
}






private String timeouthour;
private String timeoutmin;
private String timeoutseconds;
private String emplid;


public String getEmplid() {
	return emplid;
}






public void setEmplid(String emplid) {
	this.emplid = emplid;
}






public String getTimeinhour() {
	return timeinhour;
}
public void setTimeinhour(String timeinhour) {
	this.timeinhour = timeinhour;
}
public String getTimeinmin() {
	return timeinmin;
}
public void setTimeinmin(String timeinmin) {
	this.timeinmin = timeinmin;
}
public String getTimeinseconds() {
	return timeinseconds;
}
public void setTimeinseconds(String timeinseconds) {
	this.timeinseconds = timeinseconds;
}
public String getTimeouthour() {
	return timeouthour;
}
public void setTimeouthour(String timeouthour) {
	this.timeouthour = timeouthour;
}
public String getTimeoutmin() {
	return timeoutmin;
}
public void setTimeoutmin(String timeoutmin) {
	this.timeoutmin = timeoutmin;
}
public String getTimeoutseconds() {
	return timeoutseconds;
}
public void setTimeoutseconds(String timeoutseconds) {
	this.timeoutseconds = timeoutseconds;
}







}
