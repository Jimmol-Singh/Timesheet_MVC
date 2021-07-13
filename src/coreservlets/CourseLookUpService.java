package coreservlets;

import coreservlets.Student;

public interface CourseLookUpService {
	Student findStudent(String uID, String passWord);
}
