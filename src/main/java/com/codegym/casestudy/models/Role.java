package com.codegym.casestudy.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class Role implements Serializable, GrantedAuthority {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    @NotEmpty
    private String permission;

    @JsonIgnore
    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    public List < User > getUsers() {
        return users;
    }

    public void setUsers(List < User > users) {
        this.users = users;
    }

    @Override
    public String getAuthority() {
        return this.permission;
    }
}
