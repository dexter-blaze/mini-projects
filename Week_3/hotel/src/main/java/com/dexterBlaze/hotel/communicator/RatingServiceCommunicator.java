/**
  communicates with the rating service
 **/
package com.dexterBlaze.hotel.communicator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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


        ResponseEntity<Long> response = restTemplate.getForEntity(url+id, Long.class);
        return response.getBody();
    }
}
