package com.example.productfeed.service;

import com.example.productfeed.dto.OrderRequest;
import com.example.productfeed.feign.OrderClient;
import com.example.productfeed.repository.ClothesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderPlaceService {

    private ClothesRepository clothesRepository;
    private OrderClient orderClient;

    public void placeOrder(OrderRequest orderRequest){

        if (clothesRepository.findBySkuCode(orderRequest.getSkuCode()).get().getAvailQuantity() > orderRequest.getQuantity()){

            orderClient.placeOrder(orderRequest);

        }

    }
}
