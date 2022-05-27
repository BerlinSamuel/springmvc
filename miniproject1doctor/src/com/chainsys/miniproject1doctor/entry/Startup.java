package com.chainsys.miniproject1doctor.entry;

import java.sql.Connection;

import com.chainsys.miniproject1doctor.dao.DoctorDao;
import com.chainsys.miniproject1doctor.pojo.Doctor;
import com.chainsys.miniproject1doctor.test.TestDoctorDao;

public class Startup {

	public static void main(String[] args) {
		//TestDoctorDao.testInsertDoctor();
		//TestDoctorDao.testUpdateDocotor();
		//TestDoctorDao.testDeleteDoctor();
		//TestDoctorDao.testGetAllDoctors();
		TestDoctorDao.testGetDoctorById();
	}

}
