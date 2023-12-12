package io.github.js.sponge.web.study;

import io.github.js.sponge.application.study.StudyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class StudyRestController {

    private final StudyService studyService;

    @GetMapping("/study/{seq}")
    public StudyResponse getStudy(@PathVariable("seq") Long seq) {
        return studyService.getStudy(seq);
    }

}
