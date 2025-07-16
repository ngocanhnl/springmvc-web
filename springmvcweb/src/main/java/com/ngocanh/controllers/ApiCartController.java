/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ngocanh.controllers;
import com.ngocanh.pojo.Cart;
import com.ngocanh.services.ReceiptService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestBody;



/**
 *
 * @author admin
 */
@RestController
@RequestMapping("/api")
public class ApiCartController {
    @Autowired
    private ReceiptService receiptService;
    
    
    @PostMapping("/carts")
    @ResponseStatus(HttpStatus.CREATED)
    public void addToCart(@RequestBody List<Cart> cart){
        this.receiptService.addReceipt(cart);
    }
    
    
}
