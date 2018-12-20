package cn.edu.ncu.service;

import cn.edu.ncu.dao.BookDao;
import cn.edu.ncu.entity.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {


    @Autowired

    private BookDao bookDao;

    public List<Book> findBookByCategoryId(@Param("id") int id){
        return  bookDao.findBookByCategoryId(id);
    }


}