package com.example.homework65.controller;

import com.example.homework65.entity.Comment;
import com.example.homework65.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private final CommentService commentService;

    @GetMapping
    public List<Comment> findAllComments() {
        return commentService.findAllComments();
    }

    @GetMapping("/{id}")
    public Comment findCommentById(@PathVariable Long id) {
        return commentService.findCommentById(id);
    }

    @PostMapping
    public Comment saveComment(@RequestBody Comment comment) {
        return commentService.saveComment(comment);
    }

    @DeleteMapping("/{id}")
    public void deleteCommentById(@PathVariable Long id) {
        commentService.deleteCommentById(id);
    }

}