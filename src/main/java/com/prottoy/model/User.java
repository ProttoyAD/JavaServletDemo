package com.prottoy.model;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@ToString
@Entity
@Table(name = "TBL_USER")
@AllArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String password;
//    @Column
//    @Enumerated(EnumType.STRING)
//    private UserRole role;

    public User() {}
}