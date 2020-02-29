package com.clurgo.nanorent.rest.resource;

import com.clurgo.nanorent.rest.resource.model.ResourceDTO;
import com.clurgo.nanorent.service.resource.ResourceService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resources")
public class ResourceRestController {

    private final ResourceService resourceService;

    public ResourceRestController(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    @GetMapping
    public ResourceDTO getResourceById(@PathVariable Long resourceId) {
        return resourceService.getResourceById(resourceId);
    }

    @PutMapping
    public void addResource(@RequestBody ResourceDTO resourceDTO) {
        resourceService.addResource(resourceDTO);
    }


}
