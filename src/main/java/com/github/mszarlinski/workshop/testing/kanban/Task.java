package com.github.mszarlinski.workshop.testing.kanban;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;


import static com.github.mszarlinski.workshop.testing.kanban.Task.Status.TODO;

@Entity
public class Task {
    @Id
    private final String id;
    private final String title;
    private String assignee;
    private Status status;
    private int storyPoints; //TODO: VO

    Task(String title) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.status = TODO;
    }

    private Task() {
        // JPA
        this.id = null;
        this.title = null;
    }

    //TODO: estimate(int sp)

    public String id() {
        return id;
    }

    Status status() {
        return status;
    }

    public String title() {
        return title;
    }


    enum Status {
        TODO, IN_PROGRESS, IN_REVIEW, IN_TEST, DONE, REJECTED
    }
}
