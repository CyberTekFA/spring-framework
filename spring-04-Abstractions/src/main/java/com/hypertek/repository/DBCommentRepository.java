package com.hypertek.repository;

import com.hypertek.entity.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class DBCommentRepository implements CommentRepository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("store comment "+comment.getText());
    }
}
