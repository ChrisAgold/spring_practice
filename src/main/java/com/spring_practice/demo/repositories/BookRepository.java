package com.spring_practice.demo.repositories;

import com.spring_practice.demo.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}