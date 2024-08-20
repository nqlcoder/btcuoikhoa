package com.samsung.btcuoikhoa.repositories.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Users")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150)
    private String username;

    @Column(length = 50)
    private String password;
    private String confirmpassword;

    @Column(length = 150)
    private String email;

    @Column(length = 150)
    private String fullname;

    @Column(columnDefinition = "bit default 1")
    private boolean status;
}
