package coreservlets;

public interface logService {

	logBean log(String starttime,String endtime, String paytype, String emplid,String uID, String passWord);
	logBean coursebean = new logBean();
}
