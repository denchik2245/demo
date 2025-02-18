package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    List<Post> list = new ArrayList<>();
    public List<Post> listAllPosts() {
        list.add(new Post("First post",new Date()));
        list.add(new Post("Second post", new Date()));
        list.add(new Post("Third post", new Date()));
        return list;
    }
}