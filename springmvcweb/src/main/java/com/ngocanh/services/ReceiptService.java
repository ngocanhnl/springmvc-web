/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ngocanh.services;


import com.ngocanh.pojo.Cart;
import java.util.List;

/**
 *
 * @author huu-thanhduong
 */
public interface ReceiptService {
    void addReceipt(List<Cart> carts);
}
