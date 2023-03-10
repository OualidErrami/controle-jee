package com.example.billingservice.entities;


import com.example.billingservice.model.Customer;
import com.example.billingservice.model.Product;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public double quantity;
    public double price;
    public Long product_ID;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne
    public Bill bill;
    @Transient
    public Product product;
    @Transient
    public String productName;
    @Transient
    public Customer customer;
}
