package com.github.mszarlinski.workshop.testing.kanban;

import org.junit.jupiter.api.Test;


import static com.github.mszarlinski.workshop.testing.kanban.Task.Status.TODO;
import static org.assertj.core.api.Assertions.assertThat;

class KanbanUnitTest {

    Kanban kanban = new Kanban(new TestTaskRepository());

    @Test
    void createdTaskShouldBeToDo() {
        // when
        Task task = kanban.createNewTask("some title");

        //then
        assertThat(task.status()).isEqualTo(TODO);
    }
}