package com.itheima.service.impl;

import com.itheima.controller.Code;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.exception.BusinessException;
import com.itheima.exception.SystemException;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mendy
 * @create 2023-06-29 14:03
 */

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;


    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    public Book getById(Integer id) {

        if(id == 1){
            throw new BusinessException(Code.BUSINESS_ERR, "Please don't use your technical skills to challenge my patience!!!");
        }

        //Wrap potential exceptions and convert them into custom exceptions
        try {
            int i = 1/0;
        } catch (ArithmeticException e) {
            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR, "Server access timeout, please try again!!!", e);
        }

        return bookDao.getById(id);
    }

    public List<Book> getAll() {

        return bookDao.getAll();
    }

}
