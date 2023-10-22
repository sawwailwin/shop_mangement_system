package com.sms.shopmangementsystem.service;

import java.util.List;

import com.sms.shopmangementsystem.entity.Item;

public interface ItemService {

    public Item saveItem(Item item);

    public List<Item> fetchItems();

    public Item fetchItemById(long itemID);

    public Item updateItem(long itemID, Item item);

    public void deleteItemById(long itemID);

    public Item fetchItemByName(String itemName);

}
