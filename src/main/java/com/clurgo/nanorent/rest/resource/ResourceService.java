package com.clurgo.nanorent.rest.resource;

import java.util.List;

public interface ResourceService {

    // get all resources
    List<ResourceDTO> getAllResources();

    // get one given resource details
    ResourceDTO getResource(Long recourceId);

    // add new resource
    void addResource(String resourceName, String categorieName);
}
