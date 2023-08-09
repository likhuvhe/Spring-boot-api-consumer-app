package com.apiConsumerApp.controller;

import com.apiConsumerApp.model.Province;
import com.apiConsumerApp.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/province")
public class ProvinceController {
    @Autowired
    private ProvinceService service;

    @GetMapping()
    public ResponseEntity<List<Province>> getProvince() {
        return new ResponseEntity<>(service.fetchProvince(), HttpStatus.OK);
    }
}
