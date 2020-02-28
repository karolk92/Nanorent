package com.clurgo.nanorent.service.resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Override
    @Transactional
    public List<ResourceDTO> getAllResources() {
        return null;
    }

    @Override
    @Transactional
    public ResourceDTO getResource() {
        return null;
    }
}
