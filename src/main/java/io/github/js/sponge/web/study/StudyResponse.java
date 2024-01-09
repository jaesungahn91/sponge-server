package io.github.js.sponge.web.study;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.github.js.sponge.domain.study.Study;

import java.util.List;

import static io.github.js.sponge.LocalDateTimeUtils.format;

@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public record StudyResponse(Long studySeq,
                            String createdAt,
                            String updatedAt,
                            String expiredAt,
                            String title,
                            String content,
                            String objective,
                            Integer recruitNumber,
                            Boolean isIgnoreRecruit,
                            String stateName,
                            String cityName,
                            String categoryName,
                            String topicName,
                            Boolean isEnded,
                            String memberCheckTypeName,
                            String progressTypeName,
                            String startDate,
                            String endDate,
                            List<Integer> steps) {


    public static StudyResponse from(Study study) {
        return new StudyResponse(study.getStudySeq(),
                format(study.getCreatedAt()),
                format(study.getUpdatedAt()),
                format(study.getExpiredAt()),
                study.getTitle(),
                study.getContent(),
                study.getObjective(),
                study.getRecruitNumber(),
                study.getIsIgnoreRecruit(),
                study.getState().getName(),
                study.getCity().getName(),
                study.getCategory().getName(),
                study.getTopic().getName(),
                study.getIsEnded(),
                study.getMemberCheckType().getName(),
                study.getProgressType().getName(),
                format(study.getStartDate()),
                format(study.getEndDate()),
                study.getSteps());
    }

}
