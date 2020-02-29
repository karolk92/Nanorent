package com.clurgo.nanorent.service.resource;

import com.clurgo.nanorent.rest.resource.model.ResourceDTO;

import java.util.List;

public interface ResourceService {

    List<ResourceDTO> getResourcesByCategoryId(Long categoryId);

    ResourceDTO getResourceById(Long id);

    void addResource(ResourceDTO resource);

    void deleteResource(ResourceDTO resource);
}
