package com.example.demo.models.articleSearch;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
public class Response {
    private List<Doc> docs;
    private Meta meta;
}
