package com.example.MyLittleTwitter.domain.util;

import com.example.MyLittleTwitter.domain.User;

public abstract class MessageHelper {
    public static String getAuthorName(User author) {
        return author != null ? author.getUsername() : "<none>";
    }
}