package com.joaomolina.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.joaomolina.workshopmongo.domain.Post;
import com.joaomolina.workshopmongo.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{



}
