package com.example.demo.models.articleSearch;

import com.example.demo.models.mostPopular.Article;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor

@Data
public class NytSearchResponse {
    private String status;
    private String copyright;
    private Response response;
    private String keyword;
    private List<Doc> results;
}
