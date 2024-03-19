package com.example.productfeed.controller;


import com.example.productfeed.dto.ClothesDTO;
import com.example.productfeed.service.ClothesService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clothes")
public class ClothesController {

    private ClothesService clothesService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ClothesDTO> getClothes(){
        return clothesService.getClothes();

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClothesDTO addClothes(@RequestBody ClothesDTO clothesDTO){
        return clothesService.addClothes(clothesDTO);

    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ClothesDTO updateClothes(@RequestBody ClothesDTO clothesDTO){
        return clothesService.updateClothes(clothesDTO);
    }

}
