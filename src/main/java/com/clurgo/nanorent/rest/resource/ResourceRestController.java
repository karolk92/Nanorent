package com.clurgo.nanorent.rest.resource;

import com.clurgo.nanorent.service.resource.ResourceService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resources")
public class ResourceRestController {

    private final ResourceService resourceService;

    public ResourceRestController(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    @GetMapping(value = "/{resourceId}")
    public ResourceDTO getResourceById(@PathVariable("resourceId") Long resourceId) {
        return resourceService.getResource(resourceId);
    }

    @PutMapping
    public void addResource(@PathVariable("categoryId") String categoryId,
                            @PathVariable("resourceName") String resourceName) {
        resourceService.addResource(categoryId, resourceName);
    }


}
