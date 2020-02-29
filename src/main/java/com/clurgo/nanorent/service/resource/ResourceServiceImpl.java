package com.clurgo.nanorent.service.resource;

import com.clurgo.nanorent.entity.Resource;
import com.clurgo.nanorent.repository.ResourceRepository;
import com.clurgo.nanorent.rest.resource.model.ResourceDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ResourceServiceImpl implements ResourceService {

    private final ResourceRepository resourceRepository;

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
    public ResourceDTO getResourceById(Long id) {
        Resource resource = resourceRepository.findById(id).get();

        return ResourceDTO.builder()
                .id(resource.getId())
                .name(resource.getName())
                .category(resource.getCategory())
                .reservations(resource.getReservations())
                .build();
    }

    @Override
    public void addResource(ResourceDTO resourceDTO) {
        Resource resource = Resource.builder()
                .id(resourceDTO.getId())
                .name(resourceDTO.getName())
                .category(resourceDTO.getCategory())
                .reservations(resourceDTO.getReservations())
                .build();
        resourceRepository.save(resource);
    }

    @Override
    public void deleteResourceById(Long id) {
        resourceRepository.deleteById(id);
    }
}
