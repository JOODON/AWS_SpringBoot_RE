package com.example.aws_springboot.domain.posts;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostRepositoryTest {
    @Autowired
    PostsRepository postsRepository;

//    @After//Junit이 끝날떄마다 실행되는 쿼리
//    public void cleanup(){
//        postsRepository.deleteAll();
//    }
    @Test
    public void read_board(){
        String title="테스트 게시글";
        String content="테스트 본문";

        postsRepository.save(Posts.builder().title(title).context(content).author("launcher37@naver.com").build());

        List<Posts> postsList=postsRepository.findAll();

        Posts posts=postsList.get(0);
        assertEquals(posts.getTitle(),title);
    }
}
