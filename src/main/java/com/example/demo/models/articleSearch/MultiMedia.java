package com.example.demo.models.articleSearch;


import com.example.demo.models.mostPopular.Thumbnail;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data

public class MultiMedia {

    private int rank;
    private String subtype;
    private String caption;
    private String credit;
    private String type;
    private String url;
    private int height;
    private int width;
    @JsonProperty("multimedia-metadata")
    private List<Thumbnail> multimediaMetadata;

}

