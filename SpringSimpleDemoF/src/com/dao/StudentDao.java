package com.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Map;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.bean.Student;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class StudentDao 
{
	
	private JdbcTemplate jdbctmpl;
	public void setJdbctmpl(JdbcTemplate jdbctmpl)
	{
	this.jdbctmpl = jdbctmpl;
    }
public JdbcTemplate getJdbctmpl()
{
		return jdbctmpl;
}
	
	
	 public void insertData(Student student) {  
		  
		  String sql = "INSERT INTO Student1195 "  
		    + "(studID,firstname,lastname, gender, city) VALUES (?,?, ?, ?,?)";  
		  
		  jdbctmpl.update(  
		    sql,  
		    new Object[] {student.getStudId(), student.getFirstName(), student.getLastName(),  
		    		student.getGender(), student.getCity() });  
		  
		 }  
	 public Student view(int studid)
	 {
		
		 String sql="select * from Student1195 where studID=?";
		  return jdbctmpl.queryForObject(  
				    sql,  
				    new Object[] {studid},new BeanPropertyRowMapper<Student>(Student.class)); 
		  
				  
	 }
	 public int updatecustomer(Student stud)
	 {
		 String sql="update Student1195 set firstname='"+stud.getFirstName()+"', lastname='"+stud.getLastName()+"',gender='"+stud.getGender()+"',city='"+stud.getCity()+"' where studID="+stud.getStudId()+"";  
		    return jdbctmpl.update(sql);  
		 
	 }
	 public Student delete(int studid)
	 {
		
		 String sql="select * from Student1195 where studID=?";
		  return jdbctmpl.queryForObject(  
				    sql,  
				    new Object[] {studid},new BeanPropertyRowMapper<Student>(Student.class)); 
		  
				  
	 }
	public int delete1(Student stud){  
		    String sql="delete from Student1195 where studID="+stud.getStudId()+"";  
		    return jdbctmpl.update(sql);  
		}  
	
	
}
	 
