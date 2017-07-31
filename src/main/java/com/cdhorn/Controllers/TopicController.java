package com.cdhorn.Controllers;

import com.cdhorn.models.Topic;
import org.springframework.stereotype.Controller;
//want spring frameworks Model import
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class TopicController {

    @RequestMapping("/")
    public String index(Model model) {

        Topic first = new Topic(1, "Java Spring", "Not sure how spring works");
        Topic second = new Topic(2, "Backend Fundamentals", "Get me out of Node!");
        Topic third = new Topic (3, "Java", "Java Bean and Jelly Bean");
        ArrayList<Topic> topics = new ArrayList<>();
        topics.add(first);
        topics.add(second);
        topics.add(third);
        model.addAttribute("topics", topics);

        return "index";
    }
}
