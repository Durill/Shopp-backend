package com.spring.shoppbackend.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "item_name")
    private String itemName;

    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private double price;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "product_date_of_adding")
    private Date productDateOfAdding;

    public Item() {

    }

    public Item(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getProductDateOfAdding() {
        return productDateOfAdding;
    }

    public void setProductDateOfAdding(Date productDateOfAdding) {
        this.productDateOfAdding = productDateOfAdding;
    }
}
