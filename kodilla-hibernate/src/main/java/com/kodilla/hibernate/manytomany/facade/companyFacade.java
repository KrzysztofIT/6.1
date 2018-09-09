package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class companyFacade {

    @Autowired
    private Company company;

    private static final Logger LOGGER = LoggerFactory.getLogger(companyFacade.class);

    public void processOrder(/*final Company company*/) throws CompanyProcessingException {


    }
}
