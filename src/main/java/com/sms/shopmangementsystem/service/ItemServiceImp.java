package com.sms.shopmangementsystem.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.shopmangementsystem.entity.Item;
import com.sms.shopmangementsystem.repository.ItemRepository;

@Service
public class ItemServiceImp implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public List<Item> fetchItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item fetchItemById(long itemID) {
        return itemRepository.findById(itemID).get();
    }

    @Override
    public Item updateItem(long itemID, Item item) {
        Item itemDB = itemRepository.findById(itemID).get();

        if (Objects.nonNull(item.getItemName()) && (!"".equalsIgnoreCase(item.getItemName()))) {
            itemDB.setItemName(item.getItemName());
        }
        if (Objects.nonNull(item.getItemPrice())) {
            itemDB.setItemPrice(item.getItemPrice());
        }

        return itemRepository.save(item);
    }

    @Override
    public void deleteItemById(long itemID) {
        itemRepository.deleteById(itemID);
    }

}
