package com.github.mszarlinski.workshop.testing.kanban;

import com.github.mszarlinski.workshop.testing.kanban.Task;
import com.github.mszarlinski.workshop.testing.kanban.TaskRepository;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

class TestTaskRepository implements TaskRepository {

    private final Map<String, Task> tasks = new ConcurrentHashMap<>();

    @Override
    public Task save(Task task) {
        tasks.put(task.id(), task);
        return task;
    }

    @Override
    public Optional<Task> findById(String taskId) {
        return Optional.ofNullable(tasks.get(taskId));
    }
}
