package coreservlets;

import java.util.ArrayList;

public class viewBean {

private ArrayList<String>  ViewInfo;
private ArrayList<Double> ViewTotal;
	
	public String getViewInfo() {
		String outStr="";
		for (String s: ViewInfo)
			outStr = outStr + s;
		return outStr;
	}
	public void setViewInfo(ArrayList<String> sch) {
		this.ViewInfo = sch;
	}
	
	public Double getViewTotal() {
		return ViewTotal.get(ViewTotal.size() - 1);
	}
	
	public void setViewTotal(ArrayList<Double> a) {
		this.ViewTotal = a;
	}
	
	
	
	
	
	
}

