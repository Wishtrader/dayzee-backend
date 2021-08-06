package com.app.dayzeebackend.business.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "activity", schema = "tasklist", catalog = "postgres")
@Getter
@Setter
public class ActivityEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "activated", nullable = false)
    private Short activated;

    @Basic
    @Column(name = "uuid", nullable = false, length = -1)
    private String uuid;

    @Basic
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private UserDataEntity userDataByUserId;

}
