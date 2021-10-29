package com.blogger.platform.business.concretes;

import com.blogger.platform.business.abstracts.CommentService;
import com.blogger.platform.core.utilities.results.DataResult;
import com.blogger.platform.core.utilities.results.Result;
import com.blogger.platform.core.utilities.results.SuccessDataResult;
import com.blogger.platform.core.utilities.results.SuccessResult;
import com.blogger.platform.dataAccess.abstracts.CommentDao;
import com.blogger.platform.entities.concretes.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentManager implements CommentService {
    private CommentDao commentDao;

    @Autowired
    public CommentManager(CommentDao commentDao) {
        super();
        this.commentDao = commentDao;
    }

    @Override
    public Result add(Comment comment) {
        this.commentDao.save(comment);
        return new SuccessResult("Comment added.");
    }

    @Override
    public Result delete(int commentId) {
        this.commentDao.deleteById(commentId);
        return new SuccessResult("Comment deleted.");
    }

    @Override
    public DataResult<List<Comment>> getAll() {
        return new SuccessDataResult<>(this.commentDao.findAll(), "Comments listed");
    }

    @Override
    public DataResult<Comment> getById(int commentId) {
        return new SuccessDataResult<>(this.commentDao.getById(commentId), "Comment");
    }
}
