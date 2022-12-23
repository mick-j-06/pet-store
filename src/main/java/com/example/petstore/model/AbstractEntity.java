package com.example.petstore.model;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.Instant;

@EntityListeners(value = AuditingEntityListener.class)
@MappedSuperclass
@Getter
@Setter
public class AbstractEntity implements Serializable {
    @Id
    private Integer id;
    @Column(name = "creation_date", updatable = false, nullable = false)
    private Instant creationDate;
    @Column(name = "last_modified_date")
    private Instant lastModifiedDate;
}
