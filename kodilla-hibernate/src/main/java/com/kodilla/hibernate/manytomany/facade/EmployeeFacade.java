package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeFacade {

    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeFacade.class);

    public void processOrder(final String employeeString)   {
        LOGGER.info("Start query");
        employeeDao.retrieveEmployeesWithNameLike(employeeString)
                .forEach(o -> System.out.println(o.getLastname()));
        LOGGER.info("Query ends");
    }
}
