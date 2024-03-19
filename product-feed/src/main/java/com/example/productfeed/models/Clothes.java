package com.example.productfeed.models;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("clothes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Clothes {

    @Id
    private String id;

    @Field(name = "sku_code")
    @Indexed(unique = true)
    private String skuCode;

    @Field(name = "product_name")
    private String productName;

    @Field(name = "image_path")
    private String imagePath;

    @Field(name = "amount")
    private String amount;

    @Field(name = "avail_quantity")
    private Integer availQuantity;
}
