package com.javarush.task.jdk13.task41.task4109;

public class User extends AbstractEntity {
    public String socialKey;
    public String secretKey;
    public String displayName;
    public String pictureUrl;
    public String sessionId;
    public String referenceKey;
    public int level;
    public int lesson;
    public int darkMatter;
    public int rating;
    public String email;
    public String country;
    public String city;
    public String statusMessage;

    public User() {

    }

    public User(User user) {
    super(user);
    socialKey = user.socialKey;
        secretKey = user.secretKey;
        displayName= user.displayName;
        pictureUrl = user.pictureUrl;
        sessionId = user.sessionId;
        referenceKey = user.referenceKey;
        level = user.level;
        lesson = user.lesson;
        darkMatter = user.darkMatter;
        rating = user.rating;
        email = user.email;
        country = user.country;
        city = user.city;
        statusMessage = user.statusMessage;
    }


    @Override
    public AbstractEntity clone() {
        return new User(this);
    }
}
