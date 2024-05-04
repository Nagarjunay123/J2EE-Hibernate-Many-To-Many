package controller;

import dao.StudentDao;

public class DeleteById {

	public static void main(String[] args) {


		StudentDao studentDao=new StudentDao();
		studentDao.deleteById(3);
	}

}
