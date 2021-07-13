package coreservlets;

import java.util.ArrayList;

public class Student {

    private String ssn;
    private String paytypeid;
    private ArrayList<String> mySsn;
    private ArrayList<String> myPaymentType;
    
	public String getSsn() {
		String outStr="";
		for (String s: mySsn)
			outStr = outStr + s;
		return outStr;
	}

	public void setMySsn(ArrayList<String> mySsn) {
		this.mySsn = mySsn;
	}
	

	    public String getPaytypeid() {
		String outStr="";
		for (String s: myPaymentType)
			outStr = outStr + s;
		return outStr;
	}

	public void setMyPaymentType(ArrayList<String> myPaymentType) {
		this.myPaymentType = myPaymentType;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	/*public String getPaytypeid() {
		return paytypeid;
	} */
	//public void setPaytypeid(String paytypeid) {
	//	this.paytypeid = paytypeid;
	}
 

