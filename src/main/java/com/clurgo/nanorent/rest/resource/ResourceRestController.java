package com.clurgo.nanorent.rest.resource;

import com.clurgo.nanorent.rest.category.errors.CategoryNotFoundException;
import com.clurgo.nanorent.rest.resource.errors.ResourceNotFoundException;
import com.clurgo.nanorent.rest.resource.model.ResourceDTO;
import com.clurgo.nanorent.service.resource.ResourceService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("/resources")
public class ResourceRestController {

    private final ResourceService resourceService;

    @GetMapping("/{id}")
    @ExceptionHandler({ResourceNotFoundException.class,})
    @ResponseStatus(HttpStatus.OK)
    public ResourceDTO getResourceById(@PathVariable Long id) {
        return resourceService.getResourceById(id);
    }

    @DeleteMapping(value = "{id}")
    @ExceptionHandler({ResourceNotFoundException.class,})
    @ResponseStatus(HttpStatus.OK)
    public void deleteResourceById(@PathVariable("id") Long id) {
        resourceService.deleteResourceById(id);
    }
}
