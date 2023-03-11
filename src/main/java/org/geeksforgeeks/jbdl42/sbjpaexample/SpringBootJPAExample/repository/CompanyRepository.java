package org.geeksforgeeks.jbdl42.sbjpaexample.SpringBootJPAExample.repository;

import org.geeksforgeeks.jbdl42.sbjpaexample.SpringBootJPAExample.Employee.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
