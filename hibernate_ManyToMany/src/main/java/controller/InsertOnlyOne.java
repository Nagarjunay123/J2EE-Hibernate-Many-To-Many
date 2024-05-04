package controller;

import dao.StudentDao;
import dto.Student;

public class InsertOnlyOne {

	public static void main(String[] args) {
		Student student=new Student();
		student.setStudentName("chincha");
		student.setStudentAge(29);
		student.setStudentAddress("russia");
		student.setStudentPhone(11145678l);
		
		StudentDao studentDao=new StudentDao();
		studentDao.insertOnlyStudent(student, 1, 2, 3);
	}
}
