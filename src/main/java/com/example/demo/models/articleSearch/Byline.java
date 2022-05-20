package com.example.demo.models.articleSearch;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Byline {

    private String original;
    private Person[] person;

}

