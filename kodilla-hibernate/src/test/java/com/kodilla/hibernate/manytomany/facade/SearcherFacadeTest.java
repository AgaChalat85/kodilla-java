package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SearcherFacadeTest {

    @Autowired
    SearcherFacade searcherFacade;

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    void testSearchingCompanyByNameFragment() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        //When
        List<Company> companies = searcherFacade.searchCompany("Machine");
        //Then
        try {
            assertEquals(1, companies.size());
        } finally {
            //CleanUp
            companyDao.delete(softwareMachine);
            companyDao.delete(dataMaesters);
        }
    }

    @Test
    void testSearchingEmployeeByNameFragment() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieJohnson = new Employee("Stephanie", "Johnson");
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieJohnson);
        //When
        List<Employee> employees = searcherFacade.searchEmployee("John");
        //Then
        try {
            assertEquals(2, employees.size());
        } finally {
            //CleanUp
            employeeDao.delete(johnSmith);
           employeeDao.delete(stephanieJohnson);
        }
    }

}