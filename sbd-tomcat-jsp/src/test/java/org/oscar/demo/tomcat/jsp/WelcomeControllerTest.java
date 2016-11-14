package org.oscar.demo.tomcat.jsp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Description:
 * <p>
 * Author: oscar
 * Create Date: 14/11/16
 * Version: 1.0-SNAPSHOT
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext
public class WelcomeControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;


    @Test
    public void testJspWithEl() throws Exception {
        ResponseEntity<String> entity = this.restTemplate.getForEntity("/", String.class);
        System.out.println(entity.getStatusCode());
        System.out.println(entity.getBody());

        assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(entity.getBody()).contains("Hello");
    }
}