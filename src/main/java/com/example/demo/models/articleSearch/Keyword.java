package com.example.demo.models.articleSearch;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Keyword {
    private String name;
    private String value;
    private int rank;
    private String major;
}
