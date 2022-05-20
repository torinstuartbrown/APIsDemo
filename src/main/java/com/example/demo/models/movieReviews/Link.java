package com.example.demo.models.movieReviews;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Getter

public class Link {
    private String type;
    private String url;
}
