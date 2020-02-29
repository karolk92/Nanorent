package com.clurgo.nanorent.rest.category.model;

import com.clurgo.nanorent.rest.resource.model.ResourceDTO;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CategoryDTO {

    private Long id;
    private String name;
    private List<ResourceDTO> resourceDTO;
}
