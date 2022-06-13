package com.course.course.components;

import com.course.course.models.Post;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component("com.course.course.components.PostComponent")
public class PostComponent {
    public List<Post> getPosts() {

        ArrayList<Post> post = new ArrayList<>();

        post.add(
                new Post(
                        1,
                        "Web development",
                        "Web development is the work involved in developing a website for the Internet (World Wide Web) or an intranet (a private network).",
                        "http://localhost/image/image-1.jpg",
                        new Date()
                )
        );

        post.add(
                new Post(
                        2,
                        "Web development Front-End",
                        "Web development is the work involved in developing a website for the Internet (World Wide Web) or an intranet (a private network).",
                        "http://localhost/image/image-1.jpg",
                        new Date()
                )
        );

        post.add(
                new Post(
                        3,
                        "Web development Back-End",
                        "Web development is the work involved in developing a website for the Internet (World Wide Web) or an intranet (a private network).",
                        "http://localhost/image/image-1.jpg",
                        new Date()
                )
        );

        post.add(
                new Post(
                        4,
                        "Web development FullStack",
                        "Web development is the work involved in developing a website for the Internet (World Wide Web) or an intranet (a private network).",
                        "http://localhost/image/image-1.jpg",
                        new Date()
                )
        );

        return post;
    }
}
