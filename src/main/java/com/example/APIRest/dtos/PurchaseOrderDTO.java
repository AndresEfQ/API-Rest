package com.example.APIRest.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PurchaseOrderDTO implements BaseDTO {

    private String clientName;
    private List<String> productNameList;
    private double price;
}
