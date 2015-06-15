package com.realdolmen.spring.blog.domain;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Hyuberuto on 15/06/15.
 */
@Entity
public class Comment {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    private String content;

    private Date creationDate;

    private String authorName;

    @Autowired
    @ManyToOne
    private BlogPost blogpost;

    public Comment(String content, Date creationDate, String authorName) {
        this.content = content;
        this.creationDate = creationDate;
        this.authorName = authorName;
    }

    public Comment() {
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

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
