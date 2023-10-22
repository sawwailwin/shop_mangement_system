package com.sms.shopmangementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping("/items")
    public List<Item> fetchDepartment() {
        return itemService.fetchItems();
    }

    @GetMapping("/items/{id}")
    public Item fetchDepartmentById(@PathVariable("id") long itemID) {
        return itemService.fetchItemById(itemID);
    }

    @GetMapping("/items/name/{name}")
    public Item fetchDepartmentByName(@PathVariable("name") String itemName) {
        return itemService.fetchItemByName(itemName);
    }

    @PutMapping("/items/{id}")
    public Item updateItem(@PathVariable("id") long itemID, @RequestBody Item item) {
        return itemService.updateItem(itemID, item);
    }

    @DeleteMapping("items/{id}")
    public void deleteItemById(@PathVariable("id") long itemID) {
        System.out.println("Successfully Deleted");
        itemService.deleteItemById(itemID);
    }

}
