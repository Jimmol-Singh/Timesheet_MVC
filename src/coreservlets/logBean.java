package coreservlets;

import java.util.ArrayList;

public class logBean {

private ArrayList<String>  schedule;;

private ArrayList<String>  schedule2;
	
	public String getSchedule() {
		String outStr="";
		for (String s: schedule)
			outStr = outStr + s;
		return outStr;
	}

	public void setSchedule(ArrayList<String> sch) {
		this.schedule = sch;

	}
	
	
	
	
	public String getSchedule2() {
		String outStr="";
		for (String s: schedule2)
			outStr = outStr + s;
		return outStr;
	}

	public void setSchedule2(ArrayList<String> sch) {
		this.schedule2 = sch;
	}
}


