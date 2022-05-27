package com.chainsys.miniproject1doctor.ui;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.miniproject1doctor.dao.DoctorDao;
import com.chainsys.miniproject1doctor.pojo.Doctor;
public class DoctorUi {
	public static void addNewDoctor() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Doctor id");
		Doctor newdoctor=new Doctor();
		String id=sc.nextLine();
		newdoctor.setDoctor_id(Integer.parseInt(id));
		System.out.println("Enter Doctor name");
		newdoctor.setDoctor_name(sc.nextLine());
		System.out.println("Enter dob");
		String sDate=sc.nextLine();
		Date date;
		try {
		date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
		newdoctor.setDob(date);
		} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		System.out.println("Enter city");
		newdoctor.setCity(sc.nextLine());
		System.out.println("Enter doctor phone number");
		String phno=sc.nextLine();
		newdoctor.setPhoneno(Long.parseLong(phno));
		System.out.println("Enter Speciality");
		newdoctor.setSpeciality(sc.nextLine());
		System.out.println("Enter standard fees");
		String fees=sc.nextLine();
		newdoctor.setStandard_fees(Integer.parseInt(fees));

		int result =DoctorDao.insertDoctor(newdoctor);
		System.out.println(result);
		}
		public static void updateNewDoctor() {
		Scanner sc = new Scanner(System.in);
		   Doctor oldEmp=DoctorDao.getDoctorById(104);
		   System.out.println(oldEmp.getDoctor_id()+" "+oldEmp.getDoctor_name()+" "+oldEmp.getStandard_fees());
		   System.out.println("Enter Doctor Name:");
		   oldEmp.setDoctor_name(sc.nextLine());
		   Calendar c1=Calendar.getInstance();
		   java.util.Date newDate=c1.getTime();
		    oldEmp.setDob(newDate);
		System.out.println("Enter Doctor Speciality:");
		oldEmp.setSpeciality(sc.nextLine());
		    System.out.println("Enter Doctor City:");
		    oldEmp.setCity(sc.nextLine());
		    System.out.println("Enter Doctor Phoneno:");
		    oldEmp.setPhoneno(sc.nextLong());
		    System.out.println("Enter Doctor standard_fees");
		    oldEmp.setStandard_fees(sc.nextInt());
		   int result =DoctorDao.updateDoctor(oldEmp);
		   System.out.println(result);
		}
		public static void deleteDoctorById() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter doctor id");
		String s1=sc.nextLine();
		   int result= DoctorDao.deleteDoctor(Integer.parseInt(s1));
		   System.out.println(result);


		}
		public static void getDoctorById() {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter doctor id");
		String s1=sc.nextLine();
		   
		    Doctor doc=DoctorDao.getDoctorById(Integer.parseInt(s1));
		   System.out.println(doc.getDoctor_id()+" "+doc.getDoctor_name()+" "+doc.getPhoneno()+" "+
		    doc.getSpeciality()+" "+doc.getStandard_fees());


		}
		public static void getAllDoctor() {
		       
		List<Doctor> allDoctors=DoctorDao.getAllDoctors();
		Iterator<Doctor> dociterator=allDoctors.iterator();
		while (dociterator.hasNext()) {
		Doctor doc=dociterator.next();
		System.out.println(doc.getDoctor_id()+" "+doc.getDoctor_name()+" "+doc.getPhoneno()+" "
		+doc.getSpeciality()+" "+doc.getStandard_fees()+" "+doc.getCity());}
		}
		}
