package com.example.WebWear.entity;

import com.example.WebWear.dto.user.UserRegisterData;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Table(name = "usuario")
@Entity(name = "Usuario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String postalCode;
    private String phone_number;
    private String date;
    private boolean active;


    public User(UserRegisterData data){
        this.active = true;
        this.name = data.name();
        this.email = data.email();
        this.password = data.password();
        this.postalCode = data.postalCode();
    }


}
