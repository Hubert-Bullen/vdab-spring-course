package com.realdolmen.spring.blog.repositories;

import com.realdolmen.spring.blog.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hyuberuto on 15/06/15.
 */
public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
