package io.github.js.sponge.domain.study;

import io.github.js.sponge.domain.common.AbstractCodedEnumConverter;
import io.github.js.sponge.domain.common.CodedEnum;
import lombok.Getter;

import java.util.List;

import static io.github.js.sponge.domain.study.Topic.*;

@Getter
public enum Category implements CodedEnum<Integer> {
    LANGUAGE("어학", 1, List.of(
            ENGLISH, JAPANESE, CHINESE, GERMAN, RUSSIAN, FRENCH, VIETNAMESE, ETC_LANGUAGE
    )),
    LICENSE("자격증", 2, List.of(
            TOEIC,
            OPIC,
            TOEFL,
            TEPS,
            JLPT,
            HSK,
            COMPUTER_UTILIZATION,
            ENGINEER_CERTIFICATE,
            KOREAN_HISTORY,
            NATIONAL_EXAM,
            TEACHER_EXAM,
            REAL_ESTATE_AGENT,
            ACCOUNTING_EXAM,
            ETC_CERTIFICATE
    )),
    EXAM("시험", 3, List.of(
            SUNEUNG,
            NAESIN,
            SCHOOL_ENTRANCE,
            HIGH_SCHOOL,
            MIDDLE_SCHOLL,
            UNIVERSITY,
            ETC_EXAM
    )),
    EMPLOYANDSTARTUP("취업/창업", 4, List.of(
            OFFISIAL,
            NCS,
            INTERVIEW,
            SELF_INTRODUCE,
            OFFISIAL_CORP,
            CONSTRUCT,
            RECRUITMENT,
            ETC_EMPLOYANDSTARTUP
    )),
    HOBBY("취미", 5, List.of(
            HEALTH,
            READING,
            STOCK,
            ETC_HOBBY
    )),
    SKILL("기술", 6, List.of(
            PROGRAMMING,
            VIDEO_PICTURE,
            DESIGN,
            COOK,
            BIG_DATA,
            ETC_SKILL
    )),
    ETC("기타", 7, List.of(
            STUDY_TIME,
            EARLY_WAKEUP,
            MOTIVATION,
            ATTENDANCE_CHECK,
            FREEDOM,
            Topic.ETC
    ));

    private final String name;
    private final Integer code;
    private final List<Topic> topics;

    Category(String name, Integer code, List<Topic> topics) {
        this.name = name;
        this.code = code;
        this.topics = topics;
    }

    @jakarta.persistence.Converter(autoApply = true)
    static class Converter extends AbstractCodedEnumConverter<Category, Integer> {
        public Converter() {
            super(Category.class);
        }
    }
}
