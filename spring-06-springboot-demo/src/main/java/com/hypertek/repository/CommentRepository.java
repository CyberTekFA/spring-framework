package com.hypertek.repository;

import com.hypertek.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
