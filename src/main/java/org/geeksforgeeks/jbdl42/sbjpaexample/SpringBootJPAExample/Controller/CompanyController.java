package org.geeksforgeeks.jbdl42.sbjpaexample.SpringBootJPAExample.Controller;

import java.util.List;

import org.geeksforgeeks.jbdl42.sbjpaexample.SpringBootJPAExample.Employee.Company;
import org.geeksforgeeks.jbdl42.sbjpaexample.SpringBootJPAExample.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	private CompanyRepository companyrepository;
	
	@RequestMapping("/test")
	public String test() {
		return "api is running perfect";
	}
	
	@PostMapping("/create")
	public Company createcompany(@RequestBody Company company) {
		return companyrepository.save(company);
	}
	
	@GetMapping("/find")
	public List<Company> finalAllCompany(){
		return companyrepository.findAll();
	}
	
	
	
}
