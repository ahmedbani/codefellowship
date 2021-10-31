package com.example.codefellowship;

import com.example.codefellowship.Models.ApplicationUser;
import com.example.codefellowship.Models.Post;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CodefellowshipApplicationTests {

	@Test
	void testconstructors() {
		ApplicationUser applicationUser = new ApplicationUser("ahmad","12345","ahmad","bani-salameh","19/9/1998","software developer");
		assertEquals("ApplicationUser{id=0, username='ahmad', password='12345', firstName='ahmad', lastName='bani-salameh', dateOfBirth='19/9/1998', bio='software developer', posts=null}",applicationUser.toString());
		Post post = new Post("coding is exausting",applicationUser);
		assertEquals("Post{id=0, body='coding is exausting', createdAt='null', applicationUser=ahmad bani-salameh}",post.toString());
	}

}
