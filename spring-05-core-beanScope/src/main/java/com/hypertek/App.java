package com.hypertek;

import com.hypertek.configs.CommentConfig;
import com.hypertek.entity.Comment;
import com.hypertek.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setName("Johnson");
        comment.setText("Spring framework");
        ApplicationContext context = new AnnotationConfigApplicationContext(CommentConfig.class);
        var cs2 = context.getBean(CommentService.class);
        var cs1 = context.getBean(CommentService.class);
        cs1.publishComment(comment);
        cs2.publishComment(comment);
        System.out.println(cs1 == cs2);
    }
}
