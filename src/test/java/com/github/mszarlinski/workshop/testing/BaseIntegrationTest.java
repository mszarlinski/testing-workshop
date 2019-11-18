package com.github.mszarlinski.workshop.testing;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;


import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(classes = TestingWorkshopApplication.class, webEnvironment = RANDOM_PORT)
public abstract class BaseIntegrationTest {

    @Autowired
    protected TestRestTemplate client;
}
