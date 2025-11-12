/**
  communicates with the rating service
 **/
package com.dexterBlaze.hotel.communicator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.ObjectError;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class RatingServiceCommunicator {
    //creating an instance of RestTemplate
    private final RestTemplate restTemplate;

    //we need to inject it as a bean
    //doing constructor injection in springboot using autowired annotation -> working?
    //will create object of restTemplateBuilder and inject it in this class while creation of object of this class.
    @Autowired
    public RatingServiceCommunicator(RestTemplateBuilder restTemplateBuilder) {
        //build() function of RestTemplateBuilder creates our instance of rest template
        this.restTemplate = restTemplateBuilder.build();
    }

    //now we are connecting with the rating service and fetching the rating.
    public long getRating(String id) {
        String url = "http://localhost:8081/rating/id/";


//        ResponseEntity<Long> response = restTemplate.getForEntity(url+id, Long.class);
        Long responseObject = restTemplate.getForObject(url+id, Long.class);

        return responseObject;
    }

    public void addRating(Map<String, Long> ratingMap) {
        String url ="http://localhost:8081/rating/add";
        //we wrote the type of HttpEntity here to avoid the warning, when we will be sending headers etc.
        //we won't mention the type sometimes
        HttpEntity<Map<String, Long>> requestEntity = new HttpEntity<>(ratingMap);

//        restTemplate.postForObject(url, ratingMap, Object.class);
        restTemplate.exchange(url, HttpMethod.POST, requestEntity, Object.class);

    }
}
