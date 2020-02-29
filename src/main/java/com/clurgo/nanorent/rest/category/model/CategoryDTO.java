package com.clurgo.nanorent.rest.category.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryDTO {

    private Long id;
    private String name;
}
