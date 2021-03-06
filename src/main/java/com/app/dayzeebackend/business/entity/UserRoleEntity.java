package com.app.dayzeebackend.business.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user_role", schema = "tasklist", catalog = "postgres")

@Getter
@Setter

public class UserRoleEntity {
    @Id
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Basic
    @Column(name = "role_id", nullable = false)
    private Long roleId;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private UserDataEntity userDataByUserId;

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id", nullable = false)
    private RoleDataEntity roleDataByRoleId;

}
