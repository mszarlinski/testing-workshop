package com.github.mszarlinski.workshop.testing.kanban;

import org.springframework.stereotype.Component;

@Component
public class Kanban {

    private final TaskRepository taskRepository;

    Kanban(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createNewTask(String title) {
        return taskRepository.save(new Task(title));
    }

    public void startWorkingOnTask(String taskId, String userId) {

    }

    public Task findTaskById(String taskId) {
        return taskRepository.findById(taskId).get(); //FIXME
    }
}
