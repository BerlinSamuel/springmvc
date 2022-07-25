package com.chainsys.springmvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chainsys.springmvc.dao.DoctorRepository;
import com.chainsys.springmvc.dao.EmployeeDao;
import com.chainsys.springmvc.pojo.Appointment;
import com.chainsys.springmvc.pojo.Doctor;
import com.chainsys.springmvc.pojo.DoctorAppointmentsDTO;
import com.chainsys.springmvc.pojo.Employee;
import com.chainsys.springmvc.service.DoctorService;

@Controller
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	DoctorService drService;

	@GetMapping("/doctorlist")
	public String getDoctors(Model model) {
		List<Doctor> doclist = drService.getDoctors();
		model.addAttribute("alldoctors", doclist);
		return "list-doctors";
	}

	@GetMapping("/addform")
	public String showAddForm(Model model) {
		Doctor theDoc = new Doctor();
		model.addAttribute("adddoctor", theDoc);
		return "add-doctor-form";
	}
	}