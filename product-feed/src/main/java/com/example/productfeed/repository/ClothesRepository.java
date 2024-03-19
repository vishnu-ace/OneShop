package com.example.productfeed.repository;

import com.example.productfeed.models.Clothes;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface ClothesRepository extends MongoRepository<Clothes,String> {


    @Query("{'sku_code' : ?0}")
    Optional<Clothes> findBySkuCode(String skuCode);
}
