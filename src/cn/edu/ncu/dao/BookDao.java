package cn.edu.ncu.dao;

import cn.edu.ncu.entity.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookDao {

    List<Book> findBookByCategoryId(@Param("id") int id);
    //public int insertdb(@Param("p") int p);


}
