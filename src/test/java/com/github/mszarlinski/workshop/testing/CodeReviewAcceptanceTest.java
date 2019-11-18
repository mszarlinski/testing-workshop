package com.github.mszarlinski.workshop.testing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.http.HttpStatus.PRECONDITION_FAILED;

class CodeReviewAcceptanceTest extends BaseIntegrationTest {

    @Test
    void pullRequestCannotBeMergedIfBuildIsFailing() { //INFO: lots of effort, better code it as unit test
        // given
        String prId = "pullRequest1";
        buildIsFailing();
        // when
        ResponseEntity<Object> response = client.postForEntity("/pullrequests/{prId}/merge", null, null, prId);
        // then
        assertThat(response.getStatusCode()).isEqualTo(PRECONDITION_FAILED);
        // and
        pullRequestIsNotMerged();
    }

    private void pullRequestIsNotMerged() {

    }

    private void buildIsFailing() {

    }
}
