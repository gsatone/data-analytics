package gjs.com.applications;

import org.springframework.jdbc.core.JdbcTemplate;

import gjs.com.dao.EmployeeDao;
import gjs.com.dao.EmployeeJDBCTemplate;
import gjs.com.dao.Employee;
import gjs.com.mappers.EmployeeMapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  

public class JdbcTemplateTest {


	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-rgf-config.xml"); 
		EmployeeJDBCTemplate employeeJDBCTemplate=(EmployeeJDBCTemplate)ctx.getBean("employeeJDBCTemplate");  

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		Date birthDate = null;
		Date hireDate = null;
		try {
			birthDate = dateFormat.parse("1980-03-10");
			hireDate  = dateFormat.parse("2012-11-05");
		} catch (ParseException e) {

			e.printStackTrace();
		}

		employeeJDBCTemplate.create("Gajanan", "Satone", "M", birthDate, hireDate);


		//		JdbcTemplate jdbcTemplate = dao.getJdbcTemplate();
		//
		//		String SQL = "select count(*) from departments";
		//		int rowCount = jdbcTemplate.queryForObject(SQL, Integer.class);
		//		System.out.println("Total - " + rowCount);
		//		
		//		String empSql = "SELECT * FROM employees.employees";
		//		
		//		List<Employee> employee = jdbcTemplate.query(empSql,new EmployeeMapper());
		//		
		//		for (Employee emp : employee) {
		//			System.out.println(emp.toString());
		//		}

	}
}
