package com.example.workshopsbmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.workshopsbmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

	
}