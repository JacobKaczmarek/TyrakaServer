package com.tyraka.server.entities;

import javax.persistence.*;

@Entity
@Table(name = "PLUGS")
public class Plug {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column(nullable = false)
    private float weight;

    @Column(nullable = false)
    private String material;

    public Plug(float weight, String material) {
        this.weight = weight;
        this.material = material;
    }

    public Plug() {
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
