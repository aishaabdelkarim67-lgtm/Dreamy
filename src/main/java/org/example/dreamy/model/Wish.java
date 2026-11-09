package org.example.dreamy.model;

import jakarta.persistence.*;

@Entity
public class Wish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String description;
    private double price;
    private String productUrl;

  @ManyToOne
    private Wishlist wishlist;

    public Wish(){

    }

    public Wish(String name, String description, double price, String productUrl ){
        this.name=name;
        this.description=description;
        this.price=price;
        this.productUrl=productUrl;
    }

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice(){
        return price;
    }

    public String getProductUrl(){
        return productUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public void setWishlist(Wishlist wishlist) {
        this.wishlist = wishlist;
    }
}








