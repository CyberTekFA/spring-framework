package com.hypertek.proxy;

import com.hypertek.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("notification")
public class CommentNotificationProxyImpl implements CommentNotificationProxy{

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending email notification "+comment);
    }
}
