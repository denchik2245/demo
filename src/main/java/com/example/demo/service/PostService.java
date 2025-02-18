package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts() {
        List<Post> list = new ArrayList<>();
        list.add(new Post("First post", 111));
        list.add(new Post("Second post", 222));
        list.add(new Post("Third post", 333));
        return list;
    }
}