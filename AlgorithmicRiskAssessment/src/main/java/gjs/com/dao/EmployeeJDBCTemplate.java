package gjs.com.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import gjs.com.mappers.EmployeeMapper;

public class EmployeeJDBCTemplate implements EmployeeDao{

	private DataSource dataSource;
	private SimpleJdbcCall jdbcCall;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;

	}
	
	public int getNewEmpId() {
		JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);
		String SQL = "SELECT max(emp_no) + 1 FROM employees.employees";
		int empID = jdbcTemplateObject.queryForObject(SQL, Integer.class);
		return empID;
	}

	public void create(String firstName, String lastName, String gender, Date birthDate, Date hireDate) {
		JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);
		String SQL = "insert into employees.employees (emp_no, birth_date,first_name, last_name,gender,hire_date) values (?, ?, ?, ?, ?, ?)";

		Integer empNo = getNewEmpId();
		jdbcTemplateObject.update( SQL, empNo, birthDate, firstName, lastName, gender, hireDate);
		System.out.println("Created Record Emp Num = " + empNo + " birthDate = " + birthDate + " firstName = " + firstName + " lastName = " + lastName+ " gender = " + gender+ " hireDate = " + hireDate);
		return;

	}

	public Employee getEmployee(Integer empNo) {
		SqlParameterSource in = new MapSqlParameterSource().addValue("in_emp_no", empNo);
		Map<String, Object> out = jdbcCall.execute(in);

		Employee employee = new Employee();
		employee.setEmpNo(empNo);
		employee.setBirthDate((Date)out.get("birth_date"));
		employee.setFirstName((String)out.get("first_name"));
		employee.setLastName((String)out.get("last_name"));
		employee.setGender((String)out.get("gender"));
		employee.setHireDate((Date)out.get("hire_date"));
	
		return employee;
	
	}

	public List<Employee> listEmployes() {

		JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);
		String empSql = "SELECT * FROM employees.employees"; 
		List<Employee> employee = jdbcTemplateObject.query(empSql,new EmployeeMapper());

		for (Employee emp : employee) {
			System.out.println(emp.toString());
		} 
		return employee;

	}

}
