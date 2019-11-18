package com.github.mszarlinski.workshop.testing;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;


import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.http.HttpStatus.PRECONDITION_FAILED;

class DeploymentAcceptanceTest extends BaseIntegrationTest {

    @Test
    void shouldMarkTaskAsDoneAfterDeployment() {
    }
}
