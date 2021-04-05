package com.spring_practice.demo.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import practice.spring.spring5webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}