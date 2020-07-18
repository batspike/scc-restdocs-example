package com.samcancode.restdocs.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.samcancode.restdocs.domain.Beer;

public interface BeerRepository extends PagingAndSortingRepository<Beer,UUID>{

}
