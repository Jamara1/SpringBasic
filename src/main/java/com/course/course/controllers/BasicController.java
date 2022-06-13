package com.course.course.controllers;

import com.course.course.components.PostComponent;
import com.course.course.configuration.Pages;
import com.course.course.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/home")
public class BasicController {

    @Autowired
    private PostComponent _postComponent;

    @GetMapping(path = {"/posts", "/"})
    public String index(Model model) {
        model.addAttribute("posts", this._postComponent.getPosts());

        return "index";
    }

    @GetMapping(path = {"/post/{post}"})
    public ModelAndView show(@PathVariable(required = true, name = "post") int id) {
        ModelAndView modelAndView = new ModelAndView(Pages.POST);
        List<Post> postFilter = this._postComponent.getPosts().stream()
                .filter(post -> {
                    return post.getId() == id;
                }).toList();

        modelAndView.addObject("post", postFilter.get(0));

        return modelAndView;
    }

    @GetMapping("/new-post")
    public ModelAndView getForm() {
        return new ModelAndView(Pages.NEW_POST).addObject("post", new Post());
    }

    @PostMapping("/store")
    public String store(Post post, Model model) {
        List<Post> posts = this._postComponent.getPosts();
        posts.add(post);
        model.addAttribute("posts", posts);

        return "index";
    }
}
