package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Appointments;
import com.chainsys.miniproject.pojo.Doctor;

/**
 * Servlet implementation class Employees
 */
public class Appointmentss extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Appointmentss() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		List<Appointments> allAppointmentss = AppointmentDao.getAllAppointments();
		Iterator<Appointments> dociterator = allAppointmentss.iterator();
		while (dociterator.hasNext()) {
			out.println("<hr/>");
			Appointments doc = dociterator.next();
			out.println(doc.getApp_id() + " " + doc.getPatient_name() + " " + doc.getApp_date() + " "
					+ doc.getFees_collected() + " " + doc.getApp_id());
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String submitvalue = request.getParameter("submit");
		if (submitvalue.equals("Add Appointment")) {

			PrintWriter out = response.getWriter();
			Appointments newappointment = new Appointments();

			String id = request.getParameter("id");
			int appId;

			try {
				Validator.checkStringForParseInt(id);
				appId = Integer.parseInt(id);

			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;

			}
			newappointment.setApp_id(appId);

			String name = request.getParameter("pname");
			try {
				Validator.checkStringOnly(name);
				Validator.checklengthOfString(name);
				newappointment.setPatient_name(name);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;

			}

			String sDate = request.getParameter("adate");
			Date date = null;

			try {
				date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
				newappointment.setApp_date(date);

			} catch (ParseException e) {
				e.printStackTrace();
			}

			String id1 = request.getParameter("docid");
			int docId;

			try {
				Validator.checkStringForParseInt(id1);
				docId = Integer.parseInt(id1);

			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;

			}
			newappointment.setDoctor_id(docId);

			String stdFees = request.getParameter("fees");
			float stdfees1 = 0;
			try {
				Validator.checkStringForParseFloat(stdFees);
				stdfees1 = Float.parseFloat(stdFees);
				newappointment.setFees_collected(stdfees1);

			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				System.exit(-1);
			}

			int result = AppointmentDao.insertAppointment(newappointment);
			out.println("<div> Add new appointment " + result + "</div>");
		}

		else if (submitvalue.equals("Update Appointment")) {
			doPut(request, response);
		} else if (submitvalue.equals("Delete Appointment")) {
			doDelete(request, response);
		}
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        
		PrintWriter out =response.getWriter();
		Appointments oldappointment = new Appointments();

		String id = request.getParameter("id");
		int appId;

		try {
			Validator.checkStringForParseInt(id);
			appId = Integer.parseInt(id);

		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;

		}
		oldappointment.setApp_id(appId);

		String name = request.getParameter("pname");
		try {
			Validator.checkStringOnly(name);
			Validator.checklengthOfString(name);
			oldappointment.setPatient_name(name);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;

		}

		String sDate = request.getParameter("adate");
		Date date = null;

		try {
			Validator.checkDateFormat(sDate);

		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
			oldappointment.setApp_date(date);

		} catch (ParseException e) {
			e.printStackTrace();
		}

		String id1 = request.getParameter("docid");
		int docId;

		try {
			Validator.checkStringForParseInt(id1);
			docId = Integer.parseInt(id1);

		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;

		}
		oldappointment.setDoctor_id(docId);

		String collectedFees = request.getParameter("fees");
		float stdfees1 = 0;
		try {
			Validator.checkStringForParseFloat(collectedFees);
			stdfees1 = Float.parseFloat(collectedFees);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}

		oldappointment.setFees_collected(stdfees1);

		int result = AppointmentDao.updateAppointment(oldappointment);
		out.println("<div> Update Appointment "+result+"<div/>");}
	
	

	public  void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
		PrintWriter out =response.getWriter();
		String s1 = request.getParameter("appid");
		int appId = 0;
		try {
			Validator.checkStringForParseInt(s1);
			appId = Integer.parseInt(s1);

		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;

		}

		try {
			AppointmentDao.getAppointmentById(appId);
			Validator.checkNumberForGreaterThanZero(appId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		int result =AppointmentDao.deleteAppointment(appId);
		out.println("<div> Delete The Appointment"+result+ "<div>" );

            
	  }
		
		
}