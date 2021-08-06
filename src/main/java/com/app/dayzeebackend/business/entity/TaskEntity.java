package com.app.dayzeebackend.business.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "task", schema = "tasklist", catalog = "postgres")

@Getter
@Setter

public class TaskEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "title", nullable = false, length = -1)
    private String title;

    @Basic
    @Column(name = "completed", nullable = true)
    private Short completed;

    @Basic
    @Column(name = "task_date", nullable = true)
    private Timestamp taskDate;

    @Basic
    @Column(name = "priority_id", nullable = true)
    private Long priorityId;

    @Basic
    @Column(name = "category_id", nullable = true)
    private Long categoryId;

    @Basic
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @ManyToOne
    @JoinColumn(name = "priority_id", referencedColumnName = "id")
    private PriorityEntity priorityByPriorityId;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private CategoryEntity categoryByCategoryId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private UserDataEntity userDataByUserId;

}
