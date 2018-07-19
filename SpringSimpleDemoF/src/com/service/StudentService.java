
package com.service;
import com.bean.Student;
import com.dao.StudentDao;

public class StudentService {
	
	StudentDao studentDao;

	
	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void insertData(Student student) {  
		studentDao.insertData(student);  
		 }  
	


	public Student view(int studid) {  
		return  studentDao.view(studid);  
		 }  
	public int update(Student cust)
	{
		return studentDao.updatecustomer(cust);
	}
	
	public Student delete(int studid)
	{
		return studentDao.delete(studid);
	}

	public int delete1(Student student) {
			return studentDao.delete1(student);
		
	}
	
}
