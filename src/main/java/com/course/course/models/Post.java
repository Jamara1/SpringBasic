package com.course.course.models;

import java.util.Date;

public class Post {

    private int id;
    private String title;
    private String description;
    private String urlImg;
    private Date createdAt;

    public Post() { }

    public Post(int id, String title, String description, String urlImg, Date createdAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.urlImg = urlImg;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
