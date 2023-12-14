package io.github.js.sponge.web.study;

import io.github.js.sponge.domain.study.*;
import io.github.js.sponge.web.AbstractControllerTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


class StudyRestControllerTest extends AbstractControllerTest {

    @Autowired
    private StudyRepository studyRepository;

    @Test
    void getStudyTest() throws Exception {
        // given
        studyRepository.save(new Study("테스트", State.SEOUL, City.JEJUCITY, Category.EXAM, Topic.STUDY_TIME, MemberCheckType.LEADER_CHECK, ProgressType.OFFLINE, List.of(1, 2)));

        // when * then
        mockMvc.perform(get("/study/{seq}", 1L)).andDo(print())
                .andExpect(status().isOk());
    }
}