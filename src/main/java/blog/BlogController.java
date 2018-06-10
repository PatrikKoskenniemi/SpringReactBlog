package blog;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class BlogController {


    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/blogposts", method = RequestMethod.GET, produces = "application/json")
    public BlogPost getPosts() {

        BlogPost blogPost = BlogPost.builder().title("Test")
                .content("TestContent")
                .dateTime(LocalDateTime.now())
                .type(BlogPost.Type.BIG)
                .build();
        return blogPost;
    }
}
