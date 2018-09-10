package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyFacade {

    @Autowired
    private CompanyDao companyDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);

    public void processOrder(final String companyString)   {
        LOGGER.info("Start query");
        companyDao.retrieveCompaniesWithNameLike2(companyString)
                .forEach(o -> System.out.println(o.getName()));
        LOGGER.info("Query ends");
    }
}
