package com.dev3.springboot.demo.myfirstapp.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Student {

    @NotBlank(message = "name can not be space")
    @Size(min = 2,max = 25,message = "name ${validatedValue} must be between {min} and {max}")
    @Column(nullable = false,length = 25)
    private String name;

    @Column(nullable = false,length = 25)
    private String lastName;




}
