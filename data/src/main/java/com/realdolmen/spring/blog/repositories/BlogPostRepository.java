package com.realdolmen.spring.blog.repositories;

import com.realdolmen.spring.blog.domain.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hyuberuto on 15/06/15.
 */
public interface BlogPostRepository extends JpaRepository<BlogPost, Integer> {
}
