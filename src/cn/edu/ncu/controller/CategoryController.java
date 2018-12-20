package cn.edu.ncu.controller;

import cn.edu.ncu.entity.Category;
import cn.edu.ncu.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = "/modelview")
    public ModelAndView showCategory(ModelAndView model){
        List<Category> list =categoryService.findAll();
        model.setViewName("main1");
        model.addObject("category",list);
        //这李传过去的category实际上是一个list，包含了所有的查询到的结果
        return model;

        //main1.jsp就可以调用，model里面面添加进去的attributeName，这里添加进去的是一个实体，
        // 或者实体的集合   及其属性
        //jsp中直接调用，及可以显示；
    }

}
