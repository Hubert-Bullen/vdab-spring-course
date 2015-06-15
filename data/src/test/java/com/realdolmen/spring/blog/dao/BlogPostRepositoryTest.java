package com.realdolmen.spring.blog.dao;

import com.realdolmen.spring.blog.config.TestConfig;
import com.realdolmen.spring.blog.domain.Author;
import com.realdolmen.spring.blog.domain.Blog;
import com.realdolmen.spring.blog.repositories.BlogRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Date;

/**
 * Created by Hyuberuto on 15/06/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestConfig.class)
// TODO Activate the test profile
@Profile("test")
// TODO Activate transactions
@EnableTransactionManagement
public class BlogPostRepositoryTest {
}
