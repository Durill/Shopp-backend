package com.spring.shoppbackend.controller;

import com.spring.shoppbackend.model.Item;
import com.spring.shoppbackend.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ItemController {

    @Autowired
    ItemRepository itemRepository;

    @GetMapping("/allItems")
    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }
}
