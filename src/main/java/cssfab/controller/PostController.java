package cssfab.controller;

import cssfab.model.Post;
import cssfab.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class PostController {
    @Autowired
    private PostService postService;

    @RequestMapping("/posts")
    public String getUserPosts(Model model) {
         ArrayList<Post> post = postService.getLatestPost();
         model.addAttribute("posts", post);
         return "posts";
    }
}
