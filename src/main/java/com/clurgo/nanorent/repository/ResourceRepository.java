package com.clurgo.nanorent.repository;

import com.clurgo.nanorent.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
