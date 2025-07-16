/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ngocanh.repositories;


import com.ngocanh.pojo.User;
import java.util.Map;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author huu-thanhduong
 */
public interface UserRepository {
    User getUserByUsername(String username);
    User addUser(User u);
}
