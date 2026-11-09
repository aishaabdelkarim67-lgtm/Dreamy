package org.example.dreamy.model;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;


    @Entity
    public class User {
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        private String name;
        private String email;
        private String password;

    @OneToMany(mappedBy = "user", cascade=CascadeType.ALL)
    private List<Wishlist>wishlists= new ArrayList<>();

    public User(){

    }

    public User(String name, String email,String password){
        this.name=name;
        this.email=email;
        this.password= password;
    }

    public long getId(){
    return id;
    }


    public String getName(){
        return name;
    }

    public String getEmail(){
    return email;}


    public String getPassword(){
        return password;
    }

        public List<Wishlist> getWishlists() {
            return wishlists;
        }

        public void setName(String name){
        this.name=name;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public void setPassword(String password){
        this.password= password;
    }

    public void setWishLists(List<Wishlist>wishLists){
    this.wishlists=wishLists;}
    }















