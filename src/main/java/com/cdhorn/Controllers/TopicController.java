package com.cdhorn.Controllers;

import com.cdhorn.models.Topic;
import com.cdhorn.repositories.TopicRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//want spring frameworks Model import

@Controller
public class TopicController {

    @Autowired
    private TopicRepositoryImpl repo;

    @RequestMapping("/")
    public String index(Model model) {
        List<Topic> allTopics = repo.findAll();
        model.addAttribute("topics", allTopics);
        return "index";
    }
}
