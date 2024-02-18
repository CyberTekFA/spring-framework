package com.hypertek.service;

import com.hypertek.entity.Comment;
import com.hypertek.proxy.CommentpushNotification;
import com.hypertek.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    private final CommentpushNotification commentpushNotification;
    public CommentService(CommentRepository commentRepository, @Qualifier("commentpush") CommentpushNotification commentpushNotification){
        this.commentRepository = commentRepository;
        this.commentpushNotification = commentpushNotification;
    }
    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentpushNotification.sendComment(comment);
    }

}
