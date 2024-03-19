package com.example.orderservice.service;

import com.example.orderservice.model.Order;
import com.example.orderservice.model.OrderRequest;
import com.example.orderservice.repository.OrderServiceRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private OrderServiceRepository orderServiceRepository;
    private ModelMapper modelMapper;

    public OrderRequest createOrder(OrderRequest orderRequest){

        Order toOrder = modelMapper.map(orderRequest,Order.class);

        Order savedOrder = orderServiceRepository.save(toOrder);

        return modelMapper.map(savedOrder,OrderRequest.class);



    }
}
