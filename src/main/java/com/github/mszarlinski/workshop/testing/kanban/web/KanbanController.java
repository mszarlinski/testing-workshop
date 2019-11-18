package com.github.mszarlinski.workshop.testing.kanban.web;

import com.github.mszarlinski.workshop.testing.kanban.Kanban;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
class KanbanController {

    private final Kanban kanban;

    KanbanController(Kanban kanban) {
        this.kanban = kanban;
    }

    @PostMapping("/tasks")
    ResponseEntity<String> createTask(@RequestBody CreateTaskRequest request) {
        return ResponseEntity.ok(kanban.createNewTask(request.getTitle()).id()); //FIXME: web knows domain
    }
}
