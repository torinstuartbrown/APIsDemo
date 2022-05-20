package com.example.demo.models.movieReviews;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor

public class Response {

    private String status;
    private String copyright;
    private List<Result> results;
}
