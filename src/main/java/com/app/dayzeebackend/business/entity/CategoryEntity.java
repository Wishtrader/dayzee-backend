package com.app.dayzeebackend.business.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "category", schema = "tasklist", catalog = "postgres")

@Getter
@Setter
public class CategoryEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "title", nullable = false, length = -1)
    private String title;

    @Basic
    @Column(name = "completed_count", nullable = true)
    private Long completedCount;

    @Basic
    @Column(name = "uncompleted_count", nullable = true)
    private Long uncompletedCount;

    @Basic
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private UserDataEntity userDataByUserId;

    @OneToMany(mappedBy = "categoryByCategoryId")
    private Collection<TaskEntity> tasksById;

}
