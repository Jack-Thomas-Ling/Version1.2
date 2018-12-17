package cn.edu.ncu.service;


import cn.edu.ncu.dao.CategoryDao;
import cn.edu.ncu.dao.CategoryDao1;
import cn.edu.ncu.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CategoryService {

    @Autowired

    private CategoryDao1 categoryDao1;

    public List<Category> findAll(){
        return categoryDao1.findAll();
    }

}
