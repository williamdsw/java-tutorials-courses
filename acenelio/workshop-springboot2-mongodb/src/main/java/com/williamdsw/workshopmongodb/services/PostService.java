package com.williamdsw.workshopmongodb.services;

import com.williamdsw.workshopmongodb.domain.Post;
import com.williamdsw.workshopmongodb.repository.PostRepository;
import com.williamdsw.workshopmongodb.services.exception.ObjectNotFoundException;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author William
 */

@Service
public class PostService {
    @Autowired
    private PostRepository repository;

    // Encontra objeto pelo ID
    public Post findById(String id) {
        Optional<Post> post = repository.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException(String.format("Post não encontrado com id %s", id)));
    }

    // Encontra lista por titulo
    public List<Post> findByTitle(String title) {
        // return repository.findByTitleContainingIgnoreCase (title);
        return repository.searchTitle(title);
    }

    // Encontra lista com busca completa
    public List<Post> fullSearch(String text, Date startDate, Date endDate) {
        long twentyFourHours = (24 * 60 * 60 * 1000);
        endDate = new Date(endDate.getTime() + twentyFourHours);
        return repository.fullSearch(text, startDate, endDate);
    }
}