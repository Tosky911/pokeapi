package com.pokeapi.gurru.controller;


import com.pokeapi.gurru.model.Berry;
import com.pokeapi.gurru.model.BerryResponse;
import com.pokeapi.gurru.service.BerryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
@RequiredArgsConstructor
public class BerryController {

    private final BerryService berryService;

    public BerryResponse getBerryById(String id){
        return null;
    }
}
