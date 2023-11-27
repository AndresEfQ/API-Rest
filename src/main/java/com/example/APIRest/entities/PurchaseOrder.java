package com.example.APIRest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.CascadeType;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PurchaseOrder extends Base {

    @Temporal(TemporalType.DATE)
    private Date date;
    @ManyToOne(cascade = CascadeType.ALL)
    private Client client;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Product> productList;
    private double price;

}
