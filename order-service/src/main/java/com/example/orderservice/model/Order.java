package com.example.orderservice.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "order_list")
public class Order {

    @Id
    private Integer id;
    private String skuCode;
    private Integer quantity;
}
