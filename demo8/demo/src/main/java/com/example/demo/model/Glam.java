package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Glam")
public class Glam{
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String Cosmeticname;
    String CosmeticBrand;
    int CosmeticPrice;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCosmeticname() {
        return Cosmeticname;
    }
    public void setCosmeticname(String Cosmeticname) {
        this.Cosmeticname = Cosmeticname;
    }
    public String getCosmeticBrand() {
        return CosmeticBrand;
    }
    public void setCosmeticBrand(String CosmeticBrand) {
        this.CosmeticBrand = CosmeticBrand;
    }
    public int getCosmeticPrice() {
        return CosmeticPrice;
    }
    public void setCosmeticPrice(int CosmeticPrice) {
        this.CosmeticPrice = CosmeticPrice;
}

}