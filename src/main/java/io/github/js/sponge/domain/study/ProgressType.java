package io.github.js.sponge.domain.study;

import io.github.js.sponge.domain.common.AbstractCodedEnumConverter;
import io.github.js.sponge.domain.common.CodedEnum;
import lombok.Getter;

@Getter
public enum ProgressType implements CodedEnum<Integer> {
    ONLINE(0, "온라인"),
    OFFLINE(1, "오프라인");

    private final Integer code;
    private final String name;

    ProgressType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    @jakarta.persistence.Converter(autoApply = true)
    static class Converter extends AbstractCodedEnumConverter<ProgressType, Integer> {
        public Converter() {
            super(ProgressType.class);
        }
    }
}
