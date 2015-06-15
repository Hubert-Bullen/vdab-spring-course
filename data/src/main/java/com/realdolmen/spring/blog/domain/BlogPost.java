package com.realdolmen.spring.blog.domain;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Hyuberuto on 15/06/15.
 */
@Entity
public class BlogPost {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private String content;

    private Date creationDate;

    private Date updatedDate;

    @Autowired
    @ManyToOne
    private Blog blog;

    public BlogPost(String title, String content, Date creationDate, Date updatedDate) {
        this.title = title;
        this.content = content;
        this.creationDate = creationDate;
        this.updatedDate = updatedDate;
    }

    public BlogPost() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
