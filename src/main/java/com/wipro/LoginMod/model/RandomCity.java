package com.wipro.LoginMod.model;

import javax.persistence.*;

/**
 * Created by nydiarra on 10/05/17.
 */
@Entity
@Table(name = "random_city")
public class RandomCity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}