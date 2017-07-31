package com.cdhorn.repositories;

import com.cdhorn.interfaces.TopicRepository;
import com.cdhorn.models.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TopicRepositoryImpl implements TopicRepository {

    //injects and automat wires it up
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Topic> findAll() {
        jdbcTemplate.query("SELECT * FROM topic");
        return null;
    }
}
