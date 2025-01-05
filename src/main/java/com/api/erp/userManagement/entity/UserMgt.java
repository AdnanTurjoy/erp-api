package com.api.erp.userManagement.entity;

import com.api.erp.userManagement.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "user_mgt")
public class UserMgt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String userName;

    private String password;

    private String email;

    @Enumerated(EnumType.STRING)
    private Status status = Status.ACTIVE;  // Default value for status

    private long roleId;

    private Timestamp createdAt;

    private Timestamp updatedAt;
}
