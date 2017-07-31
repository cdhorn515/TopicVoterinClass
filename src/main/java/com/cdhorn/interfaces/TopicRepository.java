package com.cdhorn.interfaces;


import com.cdhorn.models.Topic;

import java.util.List;

public interface TopicRepository {

    //create helper methods findall, findbyid, add
    List<Topic> findAll();

    void add(String title, String description);

    void delete(long id);

}
