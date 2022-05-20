package com.example.demo.models.articleSearch;

import com.example.demo.models.mostPopular.Media;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
public class Doc {


    @JsonProperty("abstract")
    private String summary;
    private String web_url;
    private String snippet;
    private String lead_paragraph;
    private String print_section;
    private String print_page;
    private String source;
    private List<MultiMedia> multimedia;
    private Headline headline;
    private List<Keyword> keyword;

    private String pub_date;
    private String document_type;
    private String news_desk;
    private String section_name;
    private String subsection_name;
    private Byline byline;
    private String imageUrl;



}
