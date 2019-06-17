package tx.declarative;

import java.util.List;

import javax.sql.DataSource;

/**
 * DAO interface for Student.
 * 
 * @author frils
 *
 */
public interface StudentDAO {

	/**
	 * method to set the dataSource.
	 * 
	 * @param dataSource
	 */
	public void setDataSource(DataSource dataSource);

	/**
	 * method to create a new student.
	 * 
	 * @param name
	 * @param age
	 * @param marks
	 * @param year
	 */
	public void create(String name, Integer age, Integer marks, Integer year);

	/**
	 * method to list all the students.
	 * 
	 * @return studentMarks
	 */
	public List<StudentMarks> getStudents();

}
