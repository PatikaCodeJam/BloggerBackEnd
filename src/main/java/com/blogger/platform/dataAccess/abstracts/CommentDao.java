package com.blogger.platform.dataAccess.abstracts;

import com.blogger.platform.entities.concretes.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentDao extends JpaRepository<Comment,Integer>{

}
