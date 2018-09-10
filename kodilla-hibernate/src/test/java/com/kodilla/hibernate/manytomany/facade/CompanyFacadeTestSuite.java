package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class CompanyFacadeTestSuite {
    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    CompanyFacade companyFacade;

    @Autowired
    EmployeeFacade employeeFacade;

    @Test
    public void testNamedQueries() {
        //Given
        Employee employee1 = new Employee("Jan", "Kowalski");
        Employee employee2 = new Employee("Maria", "Nowak");

        Company company1 = new Company("Apple");
        Company company2 = new Company("Samsung");

        employee1.getCompanies().add(company1);
        employee2.getCompanies().add(company2);

        company1.getEmployees().add(employee1);
        company2.getEmployees().add(employee2);


        companyDao.save(company1);
        int company1Id = company1.getId();
        companyDao.save(company2);
        int company2Id = company2.getId();

        employeeDao.save(employee1);
        int employee1Id = employee1.getId();
        employeeDao.save(employee2);
        int employee2Id = employee2.getId();


        //When
        companyFacade.processOrder("%Sam%");

        employeeFacade.processOrder("%owa%");


        //List<Employee> employeesWithLastnameEqual = employeeDao.retrieveEmployeesWithLastnameEqual("Kowalski");
        //List<Company> companiesWithNameLike = companyDao.retrieveCompaniesWithNameLike("Sam");
        //List<Company> companiesWithNameLike2 = companyDao.retrieveCompaniesWithNameLike2("%Sam%");

        //Then
/*
        Assert.assertEquals(1, employeesWithLastnameEqual.size());
        Assert.assertEquals(1, companiesWithNameLike.size());
        Assert.assertEquals(1, companiesWithNameLike2.size());
  */
    }
}
