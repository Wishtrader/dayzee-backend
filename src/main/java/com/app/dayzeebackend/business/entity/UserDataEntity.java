package com.app.dayzeebackend.business.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "user_data", schema = "tasklist", catalog = "postgres")

@Getter
@Setter

public class UserDataEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "email", nullable = false, length = -1)
    private String email;

    @Basic
    @Column(name = "password", nullable = false, length = -1)
    private String password;

    @Basic
    @Column(name = "username", nullable = false, length = -1)
    private String username;

    @OneToMany(mappedBy = "userDataByUserId")
    private Collection<ActivityEntity> activitiesById;

    @OneToMany(mappedBy = "userDataByUserId")
    private Collection<CategoryEntity> categoriesById;

    @OneToMany(mappedBy = "userDataByUserId")
    private Collection<PriorityEntity> prioritiesById;

    @OneToMany(mappedBy = "userDataByUserId")
    private Collection<StatEntity> statsById;

    @OneToMany(mappedBy = "userDataByUserId")
    private Collection<TaskEntity> tasksById;

    @OneToOne(mappedBy = "userDataByUserId")
    private UserRoleEntity userRoleById;
}
