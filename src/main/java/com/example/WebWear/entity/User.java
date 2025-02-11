package com.example.WebWear.entity;

import com.example.WebWear.dto.user.UserRegisterData;
import com.example.WebWear.dto.user.UserUpdateData;
import jakarta.persistence.*;
import lombok.*;


@Table(name = "usuario")
@Entity(name = "Usuario")
@Getter
@Setter
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

    public User(){}

    public void delete(){
        this.active = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void update(UserUpdateData data) {
        if(data.name() != null){
            this.name= data.name();
        }
        if(data.email() != null){
            this.email = data.email();
        }
        if(data.password() != null){
            this.password = data.password();
        }
        if(data.postalCode() != null){
            this.postalCode = data.postalCode();
        }
        if(data.phone_number() != null){
            this.phone_number = data.phone_number();
        }
        if(data.date() != null){
            this.date = data.date();
        }
    }

}















