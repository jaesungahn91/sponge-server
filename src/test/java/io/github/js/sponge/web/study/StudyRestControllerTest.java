package io.github.js.sponge.web.study;

import io.github.js.sponge.FixtureMonkeyUtils;
import io.github.js.sponge.domain.study.Study;
import io.github.js.sponge.domain.study.StudyRepository;
import io.github.js.sponge.web.AbstractControllerTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static com.navercorp.fixturemonkey.api.experimental.JavaGetterMethodPropertySelector.javaGetter;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


class StudyRestControllerTest extends AbstractControllerTest {

    @Autowired
    private StudyRepository studyRepository;

    @Test
    void getStudyTest() throws Exception {
        // given
        Study savedStudy = studyRepository.save(FixtureMonkeyUtils.getFixtureMonkey().giveMeBuilder(Study.class)
                .setNull(javaGetter(Study::getStudySeq))
                .set(javaGetter(Study::getDeleted), false)
                .set(javaGetter(Study::getTitle), "title")
                .sample());

        // when & then
        mockMvc.perform(get("/study/{seq}", savedStudy.getStudySeq()))
                .andDo(print())
                .andExpect(status().isOk());
    }
}