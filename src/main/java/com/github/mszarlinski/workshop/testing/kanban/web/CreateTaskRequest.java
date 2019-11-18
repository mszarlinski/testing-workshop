package com.github.mszarlinski.workshop.testing.kanban.web;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

class CreateTaskRequest {
    private final String title;

    @JsonCreator
    CreateTaskRequest(@JsonProperty("title") String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
