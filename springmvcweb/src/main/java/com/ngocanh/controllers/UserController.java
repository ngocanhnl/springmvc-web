/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ngocanh.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

/**
 *
 * @author admin
 */
@Controller
public class UserController {
    
    @GetMapping("/login")
    public String login(){
        
        return "login";
    }
}
