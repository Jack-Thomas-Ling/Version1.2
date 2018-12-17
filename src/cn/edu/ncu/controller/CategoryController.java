package cn.edu.ncu.controller;

import cn.edu.ncu.entity.Category;
import cn.edu.ncu.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller//交给SpringMVC管理；
@RequestMapping("/category")  //表示： 该路径下所有访问由此类处理；
/**
 * 注解在方法上的和注解在类上的路径组合/category/view
 * 注：return “main” 在前面的MVC配置中设置了前缀和后缀
 */
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/view")
    public String viewCategory(Model model){
        List<Category> list =categoryService.findAll();
        model.addAttribute("category",list);
        return "main";
    }

}
