package com.tyraka.server.entities;

import javax.persistence.*;

@Entity
@Table(name = "NOZZLES")
public class Nozzle {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column(nullable = false)
    private float weight;

    @Column(nullable = false)
    private String material;

    public Nozzle(float weight, String material) {
        this.weight = weight;
        this.material = material;
    }

    public Nozzle() {
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
