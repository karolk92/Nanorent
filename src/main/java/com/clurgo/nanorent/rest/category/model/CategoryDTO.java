package com.clurgo.nanorent.rest.category.model;

import com.clurgo.nanorent.entity.Resource;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class CategoryDTO {

    private Long id;
    private String name;
    private List<Resource> resources;
}
