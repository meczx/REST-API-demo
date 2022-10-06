package com.example.dataconnect.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dataconnect.model.Employee;
import com.example.dataconnect.service.Employeeservicein;

@Controller

public class Employeectrl { 
	
	@Autowired
	Employeeservicein employeeservicein;
	@GetMapping("/")
	public String viewHomePage(Model  model) {
		model.addAttribute ("employees" ,employeeservicein.getAll());
		employeeservicein.getAll();
		return "home";
	}
	@GetMapping("/showNewEmployeeForm")
	public String showNewEmpployeeForm(Model model) {
		Employee employee=new Employee();
			model.addAttribute("employee",employee);
			return "newEmployeeForm";
			
		
	}
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee")Employee employee) {
		employeeservicein.saveEmployee(employee);
		
		return "redirect:/";
	}
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable(value="id")int id) {
		employeeservicein.deleteEmployee(id);
			return "redirect:/";
				
	}
	@GetMapping("/showUpdateForm/{id}")
	public String showUpdateForm(@PathVariable(value="id")int id,Model model) {
		Employee employee=employeeservicein.getEmployeeById(id);
		model.addAttribute(employee);
			return "updateEmployeeForm";
				
	}
	

}
