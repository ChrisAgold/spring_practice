package com.spring_practice.demo.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import practice.spring.spring5webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
