/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ngocanh.controllers;

import com.ngocanh.pojo.Category;
import com.ngocanh.services.CategoryService;
import com.ngocanh.services.ProductService;
import jakarta.persistence.Query;
import java.util.Map;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author admin
 */
@Controller
public class HomeController {
    @Autowired
    private CategoryService cateService;
    @Autowired
    private ProductService productService;
    
    @RequestMapping("/")
    @Transactional
    public String index(Model model, @RequestParam Map<String, String> params){
        model.addAttribute("msg","hello ou");
      
        model.addAttribute("categories", this.cateService.getCates());
        model.addAttribute("products", this.productService.getProducts(params));
        
        return "index";
    }
}
