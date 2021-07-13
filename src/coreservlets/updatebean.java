package coreservlets;

import java.util.ArrayList;

public class updatebean {

	
	private ArrayList<String>  UpdatedTimeinschedule;
	private ArrayList<String>  UpdatedTimeoutschedule;
	private String idforstudent = "";;
	
	
	
	
	
	public String getIdforstudent() {
		return idforstudent;
	}

	public void setIdforstudent(String idforstudent) {
		this.idforstudent = idforstudent;
	}

	public String getTimeinSchedule() {
		String outStr="";
		for (String s: UpdatedTimeinschedule)
			outStr = outStr + s;
		return outStr;
	}

	public void setTimeinSchedule(ArrayList<String> sch) {
		this.UpdatedTimeinschedule = sch;

	}
	
	
	
	

	public String getTimeoutSchedule() {
		String outStr="";
		for (String s: UpdatedTimeoutschedule)
			outStr = outStr + s;
		return outStr;
	}

	public void setTieoutSchedule(ArrayList<String> sch) {
		this.UpdatedTimeoutschedule = sch;

	}
	
	
	
	
}
