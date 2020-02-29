package com.clurgo.nanorent.repository;

import com.clurgo.nanorent.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {

    List<Resource> getResourceByCategory_Id(Long id);
 }
