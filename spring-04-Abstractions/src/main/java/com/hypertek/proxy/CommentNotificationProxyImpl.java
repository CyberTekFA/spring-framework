package com.hypertek.proxy;

import com.hypertek.entity.Comment;
import org.springframework.stereotype.Component;

@Component
public class CommentNotificationProxyImpl implements CommentNotificationProxy{

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending email notification "+comment);
    }
}
