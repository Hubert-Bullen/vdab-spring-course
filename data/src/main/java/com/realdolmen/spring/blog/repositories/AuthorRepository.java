package com.realdolmen.spring.blog.repositories;

import com.realdolmen.spring.blog.domain.Author;
import com.realdolmen.spring.blog.domain.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hyuberuto on 15/06/15.
 */
public interface AuthorRepository  extends JpaRepository<Author, Integer> {
}
