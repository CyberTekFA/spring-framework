package com.hypertek.proxy;

import com.hypertek.entity.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("commentpush")
public class CommentpushNotification implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {

        System.out.println("Sending Push notification for Comment " + comment.getText());

    }
}
