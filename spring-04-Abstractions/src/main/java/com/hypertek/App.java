package com.hypertek;

import com.hypertek.configs.CommentConfig;
import com.hypertek.entity.Comment;
import com.hypertek.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =  new AnnotationConfigApplicationContext(CommentConfig.class);
        var commentService = context.getBean(CommentService.class);
        Comment comment =  new Comment();
        comment.setName("John");
        comment.setText("this is a message");
        commentService.publishComment(comment);

    }
}
