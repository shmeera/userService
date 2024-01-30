package com.example.user.models;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
//It allows you to define common properties and behavior in a superclass, and those properties will be inherited by the entities that extend or inherit from that superclass.
@EntityListeners(AuditingEntityListener.class)
// It allows you to automatically populate certain fields in your JPA entities, such as creation date, modification date, created by, and modified by
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @CreatedDate
    @Column(name = "created_date", nullable = false, updatable = false)
    private Date createdDate;

    @LastModifiedDate
    @Column(name = "last_modified_date")
    private Date lastModifiedDate;
}
