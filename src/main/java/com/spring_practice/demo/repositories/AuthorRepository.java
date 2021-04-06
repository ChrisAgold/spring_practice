package com.spring_practice.demo.repositories;

import com.spring_practice.demo.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
