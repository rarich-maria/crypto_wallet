package com.cryptowallet.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashMap;

@Entity
@Data
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "token")
    private String token;

    @Column(name = "approved")
    private boolean approved;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private Collection<Address> addresses;


}
