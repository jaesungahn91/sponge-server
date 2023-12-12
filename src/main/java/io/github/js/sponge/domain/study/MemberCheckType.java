package io.github.js.sponge.domain.study;

import io.github.js.sponge.domain.common.AbstractCodedEnumConverter;
import io.github.js.sponge.domain.common.CodedEnum;
import lombok.Getter;

@Getter
public enum MemberCheckType implements CodedEnum<Integer> {
    AUTO(0, "선착순 모집"),
    LEADER_CHECK(1, "검토 후 승인");

    private final Integer code;
    private final String name;

    MemberCheckType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    @jakarta.persistence.Converter(autoApply = true)
    static class Converter extends AbstractCodedEnumConverter<MemberCheckType, Integer> {
        public Converter() {
            super(MemberCheckType.class);
        }
    }
}
