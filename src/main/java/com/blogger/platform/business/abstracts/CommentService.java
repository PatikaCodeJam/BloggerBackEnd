package com.blogger.platform.business.abstracts;

import com.blogger.platform.core.utilities.results.DataResult;
import com.blogger.platform.core.utilities.results.Result;
import com.blogger.platform.entities.concretes.Comment;

import java.util.List;

public interface CommentService {

    Result add(Comment comment);

    Result delete(int commentId);

    DataResult<List<Comment>> getAll();

    DataResult<Comment> getById(int commentId);
}
