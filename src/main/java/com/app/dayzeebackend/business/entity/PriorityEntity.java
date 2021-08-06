package com.app.dayzeebackend.business.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "priority", schema = "tasklist", catalog = "postgres")

@Getter
@Setter
public class PriorityEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "title", nullable = false, length = -1)
    private String title;

    @Basic
    @Column(name = "color", nullable = false, length = -1)
    private String color;

    @Basic
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private UserDataEntity userDataByUserId;

    @OneToMany(mappedBy = "priorityByPriorityId")
    private Collection<TaskEntity> tasksById;

}
