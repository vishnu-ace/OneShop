package com.example.productfeed.feign;

import com.example.productfeed.dto.OrderRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@FeignClient("ORDER-SERVICE")
public interface OrderClient {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrderRequest placeOrder(OrderRequest orderRequest);
}
