package com.realdolmen.spring.blog.dao;

import com.realdolmen.spring.blog.config.TestConfig;
import com.realdolmen.spring.blog.domain.Author;
import com.realdolmen.spring.blog.repositories.AuthorRepository;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by cda5732 on 14/04/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestConfig.class)
// TODO Activate the test profile
@Profile("test")
// TODO Activate transactions
@EnableTransactionManagement
public class AuthorRepositoryTest {

    Author jim = new Author("Jim","Kay","JimKay@rd.com","Jim69","Licious");
    // TODO wire in the repository
    @Autowired
    private AuthorRepository ar;

    // TODO add unit tests to test the repository

    @Test
    public void testCanIAddAnAuthor(){
        ar.save(jim);
        assertEquals("Jim", ar.findOne(1).getFirstName());
    }

    @Test
    public void test(){
        ar.save(jim);

    }


}
