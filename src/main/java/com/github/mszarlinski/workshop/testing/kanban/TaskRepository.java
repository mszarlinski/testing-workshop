package com.github.mszarlinski.workshop.testing.kanban;

import java.util.Optional;
import org.springframework.data.repository.Repository;

public interface TaskRepository extends Repository<Task, String> {
    Task save(Task task);

    Optional<Task> findById(String taskId);
}
