package com.sms.shopmangementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.shopmangementsystem.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

    Item findByItemName(String itemName);

}
