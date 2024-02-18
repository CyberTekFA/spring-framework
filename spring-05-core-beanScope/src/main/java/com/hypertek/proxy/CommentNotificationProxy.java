package com.hypertek.proxy;

import com.hypertek.entity.Comment;


public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
