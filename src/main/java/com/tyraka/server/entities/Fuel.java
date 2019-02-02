package com.tyraka.server.entities;

import javax.persistence.*;

@Entity
@Table(name = "FUELS")
public class Fuel {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column(nullable = false)
    private float weight;

    @Column(nullable = false)
    private String type;

    public Fuel (float weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public Fuel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
