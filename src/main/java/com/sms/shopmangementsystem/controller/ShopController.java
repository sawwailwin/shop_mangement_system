package com.sms.shopmangementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sms.shopmangementsystem.entity.Item;
import com.sms.shopmangementsystem.service.ItemService;

@RestController
public class ShopController {

    @Autowired
    ItemService itemService;

    @GetMapping("/")
    public String shop() {
        return "Welcome to MyShop";
    }
    
    @PostMapping("/items")
    public Item saveItem(@RequestBody Item item) {
        return itemService.saveItem(item);
    }
}
