package io.github.js.sponge.domain.study;

import io.github.js.sponge.domain.common.AbstractCodedEnumConverter;
import io.github.js.sponge.domain.common.CodedEnum;
import lombok.Getter;

@Getter
public enum Topic implements CodedEnum<Integer> {
    // 어학
    ENGLISH("영어", 1, 1),
    CHINESE("중국어", 2, 1),
    JAPANESE("일본어", 3, 1),
    SPANISH("스페인어", 4, 1),
    GERMAN("독일어", 5, 1),
    RUSSIAN("러시아어", 6, 1),
    FRENCH("프랑스어", 7, 1),
    VIETNAMESE("베트남어", 8, 1),
    ETC_LANGUAGE("기타언어", 9, 1),

    // 자격증
    TOEIC("토익", 10, 2),
    OPIC("오픽", 11, 2),
    TOEFL("토플", 12, 2),
    TEPS("텝스", 13, 2),
    JLPT("JLPT", 14, 2),
    HSK("HSK", 15, 2),
    COMPUTER_UTILIZATION("컴퓨터 활용능력", 16, 2),
    ENGINEER_CERTIFICATE("기사", 17, 2),
    KOREAN_HISTORY("한국사", 18, 2),
    NATIONAL_EXAM("국가고시", 19, 2),
    TEACHER_EXAM("임용고시", 20, 2),
    REAL_ESTATE_AGENT("공인중개사", 21, 2),
    ACCOUNTING_EXAM("회계", 22, 2),
    ETC_CERTIFICATE("기타 자격증", 23, 2),

    // 시험
    SUNEUNG("수능", 24, 3),
    NAESIN("내신", 25, 3),
    SCHOOL_ENTRANCE("검정고시", 26, 3),
    HIGH_SCHOOL("고등학교", 27, 3),
    MIDDLE_SCHOLL("중학교", 28, 3),
    UNIVERSITY("대학교", 29, 3),
    ETC_EXAM("기타 시험", 30, 3),

    // 취업/창업
    OFFISIAL("공무원", 31, 4),
    NCS("NCS", 32, 4),
    INTERVIEW("면접", 33, 4),
    SELF_INTRODUCE("자소서", 34, 4),
    OFFISIAL_CORP("공기업", 35, 4),
    CONSTRUCT("건축", 36, 4),
    RECRUITMENT("멤버모집", 37, 4),
    ETC_EMPLOYANDSTARTUP("기타", 38, 4),

    // 취미
    HEALTH("운동", 39, 5),
    READING("독서", 40, 5),
    STOCK("주식", 41, 5),
    ETC_HOBBY("기타", 42, 5),

    // 기술
    PROGRAMMING("프로그래밍", 43, 6),
    VIDEO_PICTURE("영상/사진", 44, 6),
    DESIGN("디자인", 45, 6),
    COOK("요리", 46, 6),
    BIG_DATA("빅데이터", 47, 6),
    ETC_SKILL("기타 기술", 48, 6),

    // 기타
    STUDY_TIME("공부시간", 49, 7),
    EARLY_WAKEUP("스터디", 50, 7),
    MOTIVATION("동기부여", 51, 7),
    ATTENDANCE_CHECK("출석체크", 52, 7),
    FREEDOM("자율", 53, 7),
    ETC("기타", 54, 7);

    private final String name;
    private final Integer code;
    private final int parentType;

    Topic(String name, Integer code, int parentType) {
        this.name = name;
        this.code = code;
        this.parentType = parentType;
    }

    @jakarta.persistence.Converter(autoApply = true)
    static class Converter extends AbstractCodedEnumConverter<Topic, Integer> {
        public Converter() {
            super(Topic.class);
        }
    }
}
