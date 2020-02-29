package com.clurgo.nanorent.rest.resource.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResourceDTO {

    private Long id;
    private String name;
    private Long categoryId;
}
