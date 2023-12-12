package io.github.js.sponge.domain.study;

import io.github.js.sponge.domain.common.BaseEntity;
import io.hypersistence.utils.hibernate.type.array.ListArrayType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.Where;

import java.time.LocalDateTime;
import java.util.List;

import static lombok.AccessLevel.PROTECTED;

@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "studySeq", callSuper = true)
@DynamicUpdate
@Entity
@Table(name = "study", indexes = @Index(name = "study_deleted_state_code_city_code_idx", columnList = "deleted,state_code,city_code"))
@Where(clause = "deleted = false")
public class Study extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "study_seq")
    private Long studySeq;

    @Column(name = "expired_at")
    private LocalDateTime expiredAt;                                // 만료 날짜

    @Column(name = "title", length = 20)
    private String title;                                           // 스터디 모임 이름

    @Column(name = "content", columnDefinition = "text")
    private String content;                                         // 모집 내용

    @Column(name = "objective", columnDefinition = "text")
    private String objective;                                       // 목표

    @Column(name = "recruit_number")
    private Integer recruitNumber;                                  // 최대 인원

    @Column(name = "is_ignore_recruit")
    private Boolean isIgnoreRecruit;                                // 인원 상관 없음.

    @Column(name = "state_code")
    private State state;                                            // 지역 코드

    @Column(name = "city_code")
    private City city;                                              // 주소 코드

    @Column(name = "category_code")
    private Category category;                                      // 카테고리 코드

    @Column(name = "topic_code")
    private Topic topic;                                            // 상세 카테고리 코드

    @Column(name = "is_ended")
    private Boolean isEnded;                                        // 모집 마감 여부

    @Column(name = "member_check_type_code")
    private MemberCheckType memberCheckType;                        // 참가자 모집 유형

    @Column(name = "progress_type_code")
    private ProgressType progressType;                              // 진행 유형(온라인/오프라인)

    private Integer views;                                          // 조회수

    @Type(ListArrayType.class)
    @Column(name = "steps", columnDefinition = "integer[]")
    private List<Integer> steps;                                    // 스터디 단계(초, 초중, 중, 상)

    private Boolean isDateDiscuss;                                  // 협의 예정 플래그

    @Column(name = "start_date", length = 20)
    private String startDate;

    @Column(name = "end_date", length = 20)
    private String endDate;

    public Study(String title, State state, City city, Category category, Topic topic, MemberCheckType memberCheckType, ProgressType progressType) {
        this.title = title;
        this.state = state;
        this.city = city;
        this.category = category;
        this.topic = topic;
        this.memberCheckType = memberCheckType;
        this.progressType = progressType;
    }
}
