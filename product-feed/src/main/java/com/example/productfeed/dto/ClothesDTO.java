package com.example.productfeed.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClothesDTO {


    private String skuCode;


    private String productName;


    private String imagePath;


    private String amount;
}
