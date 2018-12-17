package cn.edu.ncu.dao;


import cn.edu.ncu.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryDao1 {

    List<Category> findAll();
}
