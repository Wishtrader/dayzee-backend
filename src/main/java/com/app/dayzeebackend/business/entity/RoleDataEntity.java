package com.app.dayzeebackend.business.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "role_data", schema = "tasklist", catalog = "postgres")

@Getter
@Setter
public class RoleDataEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "name", nullable = false, length = -1)
    private String name;

    @OneToMany(mappedBy = "roleDataByRoleId")
    private Collection<UserRoleEntity> userRolesById;

}
