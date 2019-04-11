package cssfab.controller;

import cssfab.model.Post;
import cssfab.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class IndexController {
    @Autowired
    PostService postService;
    @RequestMapping("/")
    public String index(Model model) {
        ArrayList<Post> posts = postService.getAllPosts();
        model.addAttribute("posts", posts);
        return "index";
    }
}
