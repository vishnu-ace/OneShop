package com.example.productfeed.service;

import com.example.productfeed.dto.ClothesDTO;
import com.example.productfeed.models.Clothes;
import com.example.productfeed.repository.ClothesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClothesService {

    private ClothesRepository clothesRepository;
    private ModelMapper modelMapper;
    private ClothesDTO clothesDTO;

    public ClothesDTO addClothes(ClothesDTO clothesDTO){

        Clothes clothes = clothesRepository.save(modelMapper.map(clothesDTO,Clothes.class));

        return modelMapper.map(clothes,ClothesDTO.class);
    }
    public List<ClothesDTO> getClothes(){

        List<Clothes> clothes = clothesRepository.findAll();

        return clothes.stream().map(clothesObj -> modelMapper.map(clothesObj, ClothesDTO.class))
                .collect(Collectors.toList());


    };
    public ClothesDTO updateClothes(ClothesDTO clothesDTO){

        Clothes resultCloth = clothesRepository.findBySkuCode(clothesDTO.getSkuCode()).orElse(null);


        modelMapper.map(clothesDTO,resultCloth);


        Clothes output = null;
        if (resultCloth != null) {
            output = clothesRepository.save(resultCloth);
        }

        return modelMapper.map(output,ClothesDTO.class);



    }
    public void deleteClothes(){}

}
