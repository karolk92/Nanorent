package com.clurgo.nanorent.service.resource;

import com.clurgo.nanorent.entity.Category;
import com.clurgo.nanorent.entity.Resource;
import com.clurgo.nanorent.repository.CategoryRepository;
import com.clurgo.nanorent.repository.ResourceRepository;
import com.clurgo.nanorent.rest.resource.model.ResourceDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ResourceServiceImpl implements ResourceService {

    private final ResourceRepository resourceRepository;
    private final CategoryRepository categoryRepository;

    @Override
    public List<ResourceDTO> getResourcesByCategoryId(Long categoryId) {
        List<Resource> resources = resourceRepository.getResourceByCategory_Id(categoryId);

        return resources.stream().map(o -> ResourceDTO.builder()
                .id(o.getId())
                .name(o.getName())
                .build())
                .collect(Collectors.toList());
    }

    @Override
    public ResourceDTO getResourceById(Long id) {
        Resource resource = resourceRepository.findById(id).get();

        return ResourceDTO.builder()
                .id(resource.getId())
                .name(resource.getName())
                .build();
    }

    @Override
    public void addResource(ResourceDTO resourceDTO) {
        Optional<Category> category = categoryRepository.findById(resourceDTO.getCategoryId());
        Resource resource = Resource.builder()
                .name(resourceDTO.getName())
                .category(category.get())
                .build();
        resourceRepository.save(resource);
    }

    @Override
    public void deleteResourceById(Long id) {
        resourceRepository.deleteById(id);
    }

}
