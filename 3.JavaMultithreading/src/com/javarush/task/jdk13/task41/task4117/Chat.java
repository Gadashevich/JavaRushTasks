package com.javarush.task.jdk13.task41.task4117;

public class Chat implements Mediator{
    private UserDB db;

    public Chat(UserDB db) {
        this.db = db;
    }

    @Override
    public void sendMessage(String msg, int userId) {
        db.getById(userId).receive(msg);
    }

    @Override
    public void register(User user) {
            db.add(user);
    }
}

