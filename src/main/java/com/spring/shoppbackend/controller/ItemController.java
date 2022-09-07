package com.spring.shoppbackend.controller;

import com.spring.shoppbackend.model.Item;
import com.spring.shoppbackend.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/v1/")
public class ItemController {

    @Autowired
    ItemRepository itemRepository;

    @GetMapping("/allItems")
    public List<Item> getAllItems() {
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

    @GetMapping("/products")
    public Optional<Item> getDetailedProductInformation(String id){
        return itemRepository.findById(Long.parseLong(id));
    }
}
