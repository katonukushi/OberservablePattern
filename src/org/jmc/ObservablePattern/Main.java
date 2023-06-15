package org.jmc.ObservablePattern;

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency("No News"); // observable
        NewsChannel channelOne = new NewsChannel(); // observer
        newsAgency.addObserver(channelOne);
        newsAgency.setNews("Elections have started!");
    }
}