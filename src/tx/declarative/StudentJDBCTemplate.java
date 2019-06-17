package tx.declarative;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(String name, Integer age, Integer marks, Integer year) {
		try {
			String query1 = "insert into Student (name,age) values (?,?)";
			jdbcTemplate.update(query1, name, age);

//			String query2 = "select * from Student where id in (select max(id) from Student)";
//			Student student = jdbcTemplate.query(query2, new StudentMapper()).get(0);
//			
			//this make an error
			String query2 = "select * from Student where id in (select max(id) from Student)";
			Student student = jdbcTemplate.queryForObject(query2, new StudentMapper());

			String query3 = "insert into Marks (sid,marks,year) values (?,?,?)";
			jdbcTemplate.update(query3, student.getId(), marks, year);

		} catch (Error e) {
			System.err.println("Ocurred an error, roll back");
			e.printStackTrace();
		}
	}

	@Override
	public List<StudentMarks> getStudents() {
		String query = "select * from Student, Marks where Student.id=Marks.sid";
		return jdbcTemplate.query(query, new StudentMarksMapper());
	}

}
