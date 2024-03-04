package com.alpha.joblisting.repository;

import com.alpha.joblisting.model.Post;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SearchRepository {

    List<Post> findByText(String text);
}
