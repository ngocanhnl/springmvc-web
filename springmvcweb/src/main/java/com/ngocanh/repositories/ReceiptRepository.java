/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ngocanh.repositories;

import com.ngocanh.pojo.Cart;
import java.util.List;

/**
 *
 * @author huu-thanhduong
 */
public interface ReceiptRepository {
    void addReceipt(List<Cart> carts);
}
