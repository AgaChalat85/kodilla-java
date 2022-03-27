package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearcherFacade {

    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    public SearcherFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> searchCompany(String fragment) {
       return companyDao.retrieveCompanyByNameFragment("%"+fragment+"%");
    }

    public List<Employee> searchEmployee(String fragment)  {
        return employeeDao.retrieveEmployeeByNameFragment("%"+fragment+"%");

    }

}
