package com.spring.shoppbackend.controller;

import com.spring.shoppbackend.model.Item;
import com.spring.shoppbackend.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/v1/")
public class ItemController {

    @Autowired
    ItemRepository itemRepository;

    @GetMapping("/allItems")
    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }

    @GetMapping("/newest3")
    public List<Item> getNewestItems(Integer numberOfItems) {
        return itemRepository.getNewestItems(3);
    }

    @GetMapping("/bestsellers")
    public List<Item> getBestsellers(Integer numberOfItems) {
        return itemRepository.getBestsellers(3);
    }
}
