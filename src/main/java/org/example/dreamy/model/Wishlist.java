package org.example.dreamy.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Wishlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String description;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "wishlist", cascade = CascadeType.ALL)
    private List<Wish> wishes = new ArrayList<>();

    // Tom constructor
    public Wishlist() {
    }

    // Constructor
    public Wishlist(String name, String description, User user) {
        this.name = name;
        this.description = description;
        this.user = user;
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public User getUser() {
        return user;
    }

    public List<Wish> getWishes() {
        return wishes;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setWishes(List<Wish> wishes) {
        this.wishes = wishes;
    }
}
