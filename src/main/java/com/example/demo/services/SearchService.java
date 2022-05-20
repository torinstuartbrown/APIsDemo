package com.example.demo.services;

import com.example.demo.models.articleSearch.Doc;
import com.example.demo.models.articleSearch.NytSearchResponse;
import com.example.demo.models.mostPopular.Article;
import com.example.demo.models.mostPopular.NytResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {

        @Value("${api_key}")
        private String apikey;

        @Autowired
        RestTemplate restTemplate;

        @Value("${searchResultsUrl}")
        private String searchResultsUrL;

        public String getKeyword() {
            return keyword;
        }

        public void setKeyword(String keyword) {
            this.keyword = keyword;
        }

        String keyword = "bitcoin";



    public List<Doc> getSearchResults(String query) {

//        ResponseEntity<NytResponse> response1 = restTemplate.getForEntity(mostPopularUrl + "api-key=" + apikey, NytResponse.class);
//        response1.getStatusCode();


//            NytSearchResponse response2 = restTemplate.getForObject(searchResultsUrL + "q="
//                    + query +
//                    "&" + "api-key=" + apikey, NytSearchResponse.class);
//            List<Doc> results = new ArrayList<>();
//
//            if (response2 != null && response2.getStatus().equals("OK")) {
//                for (Doc d : response2.getResponse().getDocs()) {
//                    results.add(d);
//                }
//            }
//            return results;
//        }

        ResponseEntity <NytSearchResponse> response2 = restTemplate.getForEntity(searchResultsUrL + "q="
                + query +
                "&" + "api-key=" + apikey, NytSearchResponse.class);
        List<Doc> results = new ArrayList<>();


        if (response2.getStatusCode().equals(HttpStatus.OK)) {

            NytSearchResponse response3 = response2.getBody();
            if (response3 != null && response3.getStatus().equals("OK")) {
                for (Doc d : response3.getResponse().getDocs()) {
                    if (d.getMultimedia() != null && !d.getMultimedia().isEmpty()) {
                        d.setImageUrl("https://www.nytimes.com/" + d.getMultimedia().get(0).getUrl());
                        results.add(d);
                    }
                }
            }
        }

        return results;
    }




}


