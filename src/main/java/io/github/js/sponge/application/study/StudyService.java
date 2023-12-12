package io.github.js.sponge.application.study;

import io.github.js.sponge.domain.study.Study;
import io.github.js.sponge.domain.study.StudyRepository;
import io.github.js.sponge.web.study.StudyResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class StudyService {

    private final StudyRepository studyRepository;

    @Transactional(readOnly = true)
    public StudyResponse getStudy(Long seq) {
        Study study = studyRepository.findById(seq).orElseThrow(() -> new IllegalArgumentException("not found study"));
        return StudyResponse.from(study);
    }

}
