package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("fridge");
        Product product2 = new Product("hairdryer");
        Product product3 = new Product("washer");
        Product product4 = new Product("pot");
        Item item1 = new Item(product1, BigDecimal.valueOf(4000), 1,BigDecimal.valueOf(4000));
        Item item2 = new Item(product2, BigDecimal.valueOf(300), 2,BigDecimal.valueOf(600));
        Item item3 = new Item(product3, BigDecimal.valueOf(1500), 1,BigDecimal.valueOf(1500));
        Item item4 = new Item(product4, BigDecimal.valueOf(100), 5,BigDecimal.valueOf(500));

        Invoice invoice = new Invoice("I:2022/02/01/53552");

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);

        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        invoice.setItems(itemList);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        int itemsSize = invoice.getItems().size();

        //Then
        assertNotEquals(0, id);
        assertEquals(4, itemsSize);

        //CleanUp
        invoiceDao.deleteById(id);

    }

}
