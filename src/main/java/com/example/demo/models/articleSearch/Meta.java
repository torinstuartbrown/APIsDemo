package com.example.demo.models.articleSearch;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Meta {

    private long hits;
    private int offset;
    private int time;

}
