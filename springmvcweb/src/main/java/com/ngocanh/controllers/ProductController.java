/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ngocanh.controllers;

import com.ngocanh.pojo.Product;
import com.ngocanh.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author admin
 */
@Controller
public class ProductController {
    @Autowired
    private ProductService prodService;
    
    @GetMapping("/products")
    public String listProducts(Model model) {
        model.addAttribute("product",new Product());
        return "products";
    }
    
    @PostMapping("/products")
    public String addProduct(@ModelAttribute(value="product") Product p){
        this.prodService.addOrUpdateProduct(p);
        return "redirect:/";
    }
    
    @GetMapping("/product")
    public String updateProduct(Model model,@PathVariable(value = "productId") int id){
        model.addAttribute("product", this.prodService.getProductById(id));
        return "products";
    }
}
