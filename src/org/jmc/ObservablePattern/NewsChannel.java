package org.jmc.ObservablePattern;

public class NewsChannel implements Channel {
    public void update(Object news) {
        System.out.println("breaking News: " + news);
    }
}
