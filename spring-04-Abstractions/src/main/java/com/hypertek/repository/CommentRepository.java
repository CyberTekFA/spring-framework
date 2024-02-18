package com.hypertek.repository;

import com.hypertek.entity.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
