package com.github.mszarlinski.workshop.testing.kanban.web;

import com.github.mszarlinski.workshop.testing.BaseIntegrationTest;
import com.github.mszarlinski.workshop.testing.kanban.Kanban;
import com.github.mszarlinski.workshop.testing.kanban.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;


import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.http.HttpStatus.OK;

class KanbanIntegrationTest extends BaseIntegrationTest {

    @Autowired
    Kanban kanban;

    @Test
    void shouldCreateTask() {
        // given
        String taskTitle = "Finance module implementation";
        // when
        ResponseEntity<String> response = client.postForEntity("/tasks", new CreateTaskRequest(taskTitle), String.class);
        // then
        assertThat(response.getStatusCode()).isEqualTo(OK);
        // when
        String taskId = response.getBody();
        Task savedTask = kanban.findTaskById(taskId);
        // then
        assertThat(savedTask.title()).isEqualTo(taskTitle);
    }
}