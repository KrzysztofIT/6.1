package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Pomidor");

        Item item1 = new Item( new BigDecimal(20), 13, new BigDecimal(30));
        Item item2 = new Item( new BigDecimal(40), 132, new BigDecimal(4000));

        Invoice invoice =  new Invoice("2018/01" );

        item1.setProduct(product);
        item2.setProduct(product);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        product.getItems().add(item1);
        product.getItems().add(item2);
        System.out.println(item1.getValue());
        System.out.println(item1 == null);
        System.out.println(invoice.getItems() == null);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);




        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        //invoiceDao.delete(id);
    }
}
