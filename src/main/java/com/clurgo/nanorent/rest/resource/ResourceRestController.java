package com.clurgo.nanorent.rest.resource;

import com.clurgo.nanorent.rest.resource.model.ResourceDTO;
import com.clurgo.nanorent.service.resource.ResourceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/resources")
public class ResourceRestController {

    private final ResourceService resourceService;

    @GetMapping("/{id}")
    public ResourceDTO getResourceById(@PathVariable Long id) {
        return resourceService.getResourceById(id);
    }

    @DeleteMapping(value = "{id}")
    public void deleteResourceById(@PathVariable("id") Long id) {
        resourceService.deleteResourceById(id);
    }
}
