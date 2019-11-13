package com.osscan.search.demo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "component", path = "component")
public interface ComponentRepository extends PagingAndSortingRepository<Component, Long> {

    List<Component> findByName(@Param("name") String name);

}
