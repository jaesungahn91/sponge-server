package io.github.js.sponge.web.study;

import io.github.js.sponge.domain.study.*;
import io.github.js.sponge.web.AbstractControllerTest;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;

import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


class StudyRestControllerTest extends AbstractControllerTest {

    static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>(
            "postgres:15-alpine"
    );

    @BeforeAll
    static void beforeAll() {
        postgres.start();
    }

    @AfterAll
    static void afterAll() {
        postgres.stop();
    }

    @DynamicPropertySource
    static void configureProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.datasource.url", postgres::getJdbcUrl);
        registry.add("spring.datasource.username", postgres::getUsername);
        registry.add("spring.datasource.password", postgres::getPassword);
    }

    @Autowired
    private StudyRepository studyRepository;

    @Test
    void getStudyTest() throws Exception {
        // given
        studyRepository.save(new Study("테스트", State.SEOUL, City.JEJUCITY, Category.EXAM, Topic.STUDY_TIME, MemberCheckType.LEADER_CHECK, ProgressType.OFFLINE));

        // when * then
        mockMvc.perform(get("/study/{seq}", 1L)).andDo(print())
                .andExpect(status().isOk());
    }
}