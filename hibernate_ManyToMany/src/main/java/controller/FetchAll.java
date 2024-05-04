package controller;

import dao.StudentDao;

public class FetchAll {

	public static void main(String[] args) {


		StudentDao studentDao=new StudentDao();
		studentDao.fetchAll();
	}

}
