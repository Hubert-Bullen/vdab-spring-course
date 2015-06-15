package com.realdolmen.spring.blog.domain;

import org.hibernate.annotations.Cascade;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import javax.persistence.*;

/**
 * Created by Hyuberuto on 15/06/15.
 */
@Entity
public class Blog {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private Date creationDate;


    @Autowired
    @OneToOne(cascade=CascadeType.PERSIST) // Meestal doen we dit niet, maar nu betekent dit dat telkens als we een Blog willen perissten (aka save in Spring) Zal het eerst ook deze saven.
    // Dit om dan geen TransientPropertyValueException te krijgen.
    private Author author;

    public Blog(String title, Date creationDate) {
        this.title = title;
        this.creationDate = creationDate;
    }

    public Blog() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
