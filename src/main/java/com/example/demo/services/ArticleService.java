package com.example.demo.services;

import com.example.demo.models.mostPopular.Article;
import com.example.demo.models.articleSearch.Doc;
import com.example.demo.models.mostPopular.NytResponse;

import com.example.demo.models.articleSearch.NytSearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {


    @Value("${api_key}")
    private String apikey;

    @Value("${mostPopularUrl}")
    private String mostPopularUrl;

    @Autowired
    RestTemplate restTemplate;

    @Value("${searchResultsUrl}")
    private String searchResultsUrL;





    public List<Article> getMostPopular() {
        NytResponse response = restTemplate.getForObject(mostPopularUrl + "api-key=" + apikey, NytResponse.class);





        List<Article> results = new ArrayList<>();
        if (response != null && response.getStatus().equals("OK")) {
            for (Article a : response.getResults()){
                if (a.getMedia() != null && !a.getMedia().isEmpty()){
                    a.setImageUrl(a.getMedia().get(0).getMediaMetadata().get(0).getUrl());
                    results.add(a);
                }
            }
        }
        return results;
    }

}
