package com.example.cruddemo;

import com.example.cruddemo.dao.StudentDAO;
import com.example.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){

		return runner -> {
				//createStudent(studentDAO);
			//createMultipleStudents(studentDAO);
			//readStudent(studentDAO);
			//queryForStudents(studentDAO);
			//queryForStudentsBylastName(studentDAO);
			//updateStudent(studentDAO);
			deleteStudent(studentDAO);
			//deleteAllStudents(studentDAO);
		};
	}

	/*private void deleteAllStudents(StudentDAO studentDAO) {
		System.out.println("Deleting all students");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Deleted row count: " +numRowsDeleted);
	} */

	private void deleteStudent(StudentDAO studentDAO) {
		int studentID = 4;
		System.out.println("Deleting student ID: " + studentID);
		studentDAO.delete(studentID);
	}

	private void updateStudent(StudentDAO studentDAO) {
		//retrieve student based on the id
		int studentID=1;
		System.out.println("Getting student by ID: " +studentID);
		Student myStudent = studentDAO.findById(studentID);

		//change first name
		System.out.println("Updating student ...");
		myStudent.setFirstName("Rosy");

		//update the student
		studentDAO.update(myStudent);

		//display the updated student
		System.out.println("Updated Student: " +myStudent);
	}

	private void queryForStudentsBylastName(StudentDAO studentDAO) {

		//get a list of students
		List<Student> theStudent = studentDAO.findByLastName("Chinky");

		//display list of students
		for(Student tempStudent : theStudent){
			System.out.println(tempStudent);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {

		//get a list of students
		List<Student> theStudents = studentDAO.findAll();

		//display list of students
		for(Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {

		//create a student object
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Preethi", "Chinky", "preethichinky@test.com");

		// save the student object
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

		//display id of the student object
		int theID = tempStudent.getId();
		System.out.println("Saved student. Generated ID: " +theID);

		//retrieve student based on the id: primary key
		System.out.println("Retrieving Student by ID: " +theID);
		Student myStudent = studentDAO.findById(theID);

		//display student
		System.out.println("Found the student: " +myStudent);
	}

	private void createMultipleStudents(StudentDAO studentDAO) {

		//create multiple objects
		System.out.println("Creating 3 student objects ...");
		Student tempStudent1 = new Student("Paul", "Doe", "paul@test.com");
		Student tempStudent2 = new Student("Sai", "Kumar", "saikumar@test.com");
		Student tempStudent3 = new Student("Harini", "Minni", "hariniminni@test.com");

		//save the student objects
		System.out.println("Saving the students ...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

	}

	public void createStudent(StudentDAO studentDAO) {

		//create student object
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Paul", "Doe", "paul@test.com");

		//save the student object
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

		//display id for the saved student
		System.out.println("Saved student. Generated ID: " +tempStudent.getId());
	}
}
