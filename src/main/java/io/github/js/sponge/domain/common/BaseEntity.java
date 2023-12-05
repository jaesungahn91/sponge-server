package io.github.js.sponge.domain.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass
public class BaseEntity extends DefaultEntity {

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Column(name = "deleted_at", columnDefinition = "timestamp with time zone")
    protected LocalDateTime deletedAt;
    protected Boolean deleted = false;

}
