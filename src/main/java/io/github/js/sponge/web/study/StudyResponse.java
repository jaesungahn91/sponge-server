package io.github.js.sponge.web.study;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.github.js.sponge.TimeUtil;
import io.github.js.sponge.domain.study.Study;

import java.util.List;

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
                TimeUtil.format(study.getCreatedAt()),
                TimeUtil.format(study.getUpdatedAt()),
                TimeUtil.format(study.getExpiredAt()),
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
                study.getStartDate(),
                study.getEndDate(),
                study.getSteps());
    }

}
