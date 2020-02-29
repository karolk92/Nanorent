package com.clurgo.nanorent.service.resource;

import com.clurgo.nanorent.entity.Resource;
import com.clurgo.nanorent.rest.resource.model.ResourceDTO;

import java.util.List;

public interface ResourceService {

    List<ResourceDTO> getResourcesByCategoryId(Long categoryId);

    ResourceDTO getResourceById(Long resourceId);

    void addResource(ResourceDTO resource);

    void deleteResource(ResourceDTO resource);
}
