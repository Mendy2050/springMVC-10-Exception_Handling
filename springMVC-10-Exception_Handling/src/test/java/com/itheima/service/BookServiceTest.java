package com.itheima.service;

import com.itheima.config.SpringConfig;
import com.itheima.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * @author Mendy
 * @create 2023-06-29 16:43
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testGetById(){
        Book book = bookService.getById(1);
        assertNotNull("Book should not be null", book);
        System.out.println(book);
    }


    @Test
    public void testGetAll(){
        List<Book> all = bookService.getAll();
        assertNotNull("All should not be null", all);
        System.out.println(all);
    }
}
