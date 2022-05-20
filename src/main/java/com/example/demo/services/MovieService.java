package com.example.demo.services;

import com.example.demo.models.movieReviews.Response;
import com.example.demo.models.movieReviews.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    @Value("${api_key}")
    private String apikey;

    @Value("${movieReviewsUrl}")
    private String movieReviewsUrl;

    @Autowired
    RestTemplate restTemplate;

    public List<Result> getReviews() {
        Response response = restTemplate.getForObject(movieReviewsUrl + "api-key=" + apikey, Response.class);

        List<Result> reviews = new ArrayList<>();
        if (response != null && response.getStatus().equals("OK")) {
            for (Result r : response.getResults()){
                if (r.getLink() != null){
                    r.setLinkURL(r.getLink().getUrl());
                }
                if(r.getCritics_pick() == 1){
                    r.setRecommended("Critic Recommendation!");
                } else r.setRecommended("");
                reviews.add(r);
            }
        }
        return reviews;
    }

}
