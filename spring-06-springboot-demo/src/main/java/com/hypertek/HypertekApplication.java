package com.hypertek;

import com.hypertek.model.Comment;
import com.hypertek.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HypertekApplication {



    public static void main(String[] args) {
        var comment = new Comment();
        comment.setAuthor("John");
        comment.setText("Spring Framework");
        var context =  SpringApplication.run(HypertekApplication.class, args);
        var cs = context.getBean(CommentService.class);
        cs.publishComment(comment);
    }

}
