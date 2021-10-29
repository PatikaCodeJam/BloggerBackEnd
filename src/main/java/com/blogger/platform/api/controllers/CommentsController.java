package com.blogger.platform.api.controllers;

import com.blogger.platform.business.abstracts.CommentService;
import com.blogger.platform.core.utilities.results.DataResult;
import com.blogger.platform.core.utilities.results.Result;
import com.blogger.platform.entities.concretes.Category;
import com.blogger.platform.entities.concretes.Comment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/comments/")
public class CommentsController {
    private CommentService commentService;

    public CommentsController(CommentService commentService) {
        super();
        this.commentService = commentService;
    }

    @PostMapping("add")
    public Result add(@RequestBody Comment comment) {
        return this.commentService.add(comment);
    }

    @PostMapping("delete")
    public Result delete(@RequestParam int commentId) {
        return this.commentService.delete(commentId);
    }

    @GetMapping("getAll")
    public DataResult<List<Comment>> getAll() {
        return this.commentService.getAll();
    }

    @GetMapping("getById")
    public DataResult<Comment> getById(@RequestParam int commentId) {
        return this.commentService.getById(commentId);
    }
}
