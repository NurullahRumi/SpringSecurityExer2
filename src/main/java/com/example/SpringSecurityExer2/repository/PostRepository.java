package com.example.SpringSecurityExer2.repository;

import com.example.SpringSecurityExer2.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
