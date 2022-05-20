package com.example.demo.models.movieReviews;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Result {

    private String display_title;
    private String mpaa_rating;
    private int critics_pick;
    private String headline;
    private Link link;
    private MultiMedia multiMedia;
    private String linkURL;
    private String recommended;



}
