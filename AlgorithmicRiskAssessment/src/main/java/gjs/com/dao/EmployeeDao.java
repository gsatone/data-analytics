package gjs.com.dao;

import java.util.Date;
import java.util.List;

import javax.sql.DataSource;


public interface EmployeeDao {

/** 
     * This is the method to be used to initialize
     * database resources ie. connection.
  */
  public void setDataSource(DataSource ds);
  
  /** 
     * This is the method to be used to create
     * a record in the Student table.
  */
  
		
  public void create(String firstName, String lastName, String gender, Date birthDate, Date hireDate);
 
  /** 
     * This is the method to be used to list down
     * a record from the Student table corresponding
     * to a passed student id.
  */
  
  public Employee getEmployee(Integer empNo);
  
  /** 
     * This is the method to be used to list down
     * all the records from the Student table.
  */
  
  public List<Employee> listEmployes();
	
	
}
