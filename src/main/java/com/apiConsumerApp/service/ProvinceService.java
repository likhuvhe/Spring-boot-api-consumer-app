package com.apiConsumerApp.service;

import com.apiConsumerApp.model.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SuppressWarnings("unchecked")
@Service
public class ProvinceService {

    @Autowired
    private RestTemplate restTemplate;

    public List<Province> fetchProvince() {
        String apiUrl = "https://api.test-sfx-hub.co.za/api/utility/province";
        return restTemplate.getForObject(apiUrl, List.class);
    }
}
