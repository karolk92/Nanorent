package com.clurgo.nanorent.service.resource;

import com.clurgo.nanorent.entity.Resource;
import com.clurgo.nanorent.repository.ResourceRepository;
import com.clurgo.nanorent.rest.resource.model.ResourceDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResourceServiceImpl implements ResourceService {

    private ResourceRepository resourceRepository;

    @Override
    public List<ResourceDTO> getResourcesByCategoryId(Long categoryId) {
        List<Resource> resources = resourceRepository.getResourceByCategory_Id(categoryId);

        return resources.stream().map(o -> ResourceDTO.builder()
                .id(o.getId())
                .name(o.getName())
                .category(o.getCategory())
                .reservations(o.getReservations())
                .build())
                .collect(Collectors.toList());
    }

    @Override
    public ResourceDTO getResourceById(Long resourceId) {
        Resource resource = resourceRepository.findById(resourceId).orElseThrow();

        return ResourceDTO.builder()
                .id(resource.getId())
                .name(resource.getName())
                .category(resource.getCategory())
                .reservations(resource.getReservations())
                .build();
    }

    @Override
    public void addResource(ResourceDTO resourceDTO) {
        Resource resource = mapToResource(resourceDTO);
        resourceRepository.save(resource);
    }

    @Override
    public void deleteResource(ResourceDTO resourceDTO) {
        Resource resource = mapToResource(resourceDTO);
        resourceRepository.delete(resource);
    }

    private Resource mapToResource(ResourceDTO resourceDTO) {
        return Resource.builder()
                .id(resourceDTO.getId())
                .name(resourceDTO.getName())
                .category(resourceDTO.getCategory())
                .reservations(resourceDTO.getReservations())
                .build();
    }
}
