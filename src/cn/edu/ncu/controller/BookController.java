package cn.edu.ncu.controller;


import cn.edu.ncu.service.BookService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

//处理方式  /book?id=1
    @RequestMapping("")
    public String showBookByCategoryId(@RequestParam("id") int id, Model model){
        model.addAttribute("books",bookService.findBookByCategoryId(id));
        return "main1";
    }


    //处理方式RESTful风格 /book/{id}

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public String getBookByCategoryId(@PathVariable("id") int id,Model model){
        model.addAttribute("books",bookService.findBookByCategoryId(id));
        return "main1";
    }


    //处理方式 /book/view/?id=1

    @RequestMapping("view")
    public String findBookByCategoryId(HttpServletRequest request)
    {
        int id=Integer.parseInt(request.getParameter("id"));
        request.setAttribute("books",bookService.findBookByCategoryId(id));
        return "main1";



    }


}
