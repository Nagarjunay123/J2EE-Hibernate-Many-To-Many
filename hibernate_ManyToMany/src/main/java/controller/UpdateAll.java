package controller;

import java.util.ArrayList;
import java.util.List;

import dao.StudentDao;
import dto.Course;
import dto.Student;

public class UpdateAll {

	public static void main(String[] args) {

		Course course1=new Course();
		course1.setCourseId(1);
		course1.setCourseName("python");
		course1.setCourseDuration(4);
		course1.setCourseFees(25000);
		course1.setCourseTrainer("gopal sir");
		
		Course course2=new Course();
		course2.setCourseId(2);
		course2.setCourseName("web");
		course2.setCourseDuration(4);
		course2.setCourseFees(30000);
		course2.setCourseTrainer("rahul sir");
		
		Course course3=new Course();
		course3.setCourseId(3);
		course3.setCourseName("sql");
		course3.setCourseDuration(1);
		course3.setCourseFees(10000);
		course3.setCourseTrainer("sankar sir");
		
		Student student1=new Student();
		student1.setStudentId(1);
		student1.setStudentName("changa");
		student1.setStudentAge(25);
		student1.setStudentAddress("japan");
		student1.setStudentPhone(55345678l);
		
		Student student2=new Student();
		student2.setStudentId(2);
		student2.setStudentName("changi");
		student2.setStudentAge(26);
		student2.setStudentAddress("australia");
		student2.setStudentPhone(88345678l);
		
		Student student3=new Student();
		student3.setStudentId(3);
		student3.setStudentName("chincha");
		student3.setStudentAge(28);
		student3.setStudentAddress("korea");
		student3.setStudentPhone(333345678l);
		
		List<Course> package1=new ArrayList<Course>();
		package1.add(course1);
		package1.add(course2);
		
		List<Course> package2=new ArrayList<Course>();
		package2.add(course1);
		package2.add(course2);
		package2.add(course3);
		
		List<Course> package3=new ArrayList<Course>();
		package3.add(course1);
		package3.add(course3);
		
		student1.setCourse(package1);
		student2.setCourse(package2);
		student3.setCourse(package3);
		
		StudentDao studentDao=new StudentDao();
		studentDao.updateAll(student1);
		studentDao.updateAll(student2);
		studentDao.updateAll(student3);

	}

}
