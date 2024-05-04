package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Course;
import dto.Student;

public class StudentDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Nag");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void saveBoth(Student student) {
//		List<Course> list=student.getCourse();
		entityTransaction.begin();
//		for(Course course:list) {
//			entityManager.persist(course);	
//		}
		entityManager.persist(student);
		entityTransaction.commit();
	}
	
	public void fetchAll() {
		Query query=entityManager.createQuery("select s from Student s");
		List list=query.getResultList();
		System.out.println(list);
	}
	
	public void updateAll(Student student) {
//		List<Course> list=student.getCourse();
		entityTransaction.begin();
//		for(Course course:list) {
//			entityManager.merge(course);	
//		}
		entityManager.merge(student);
		entityTransaction.commit();
	}
	
	public void deleteById(int studentId) {
		Student student=entityManager.find(Student.class, studentId);
		entityTransaction.begin();
		entityManager.remove(student);
		entityTransaction.commit();
	}
	public void insertOnlyStudent(Student student,int courseId1, int courseId2,int courseId3) {
		Course course1=entityManager.find(Course.class, courseId1);
		Course course2=entityManager.find(Course.class, courseId2);
		Course course3=entityManager.find(Course.class, courseId3);
		
		List<Course> list=new ArrayList<Course>();
		list.add(course1);
		list.add(course2);
		list.add(course3);
		student.setCourse(list);
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}
}
