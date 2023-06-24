package com.dev3.springboot.demo.myfirstapp.entityinheritance.mappedsuperclass;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column(nullable = false)
    //private boolean deleted = false;

    //@Column(nullable = false)
    //private Long creationTime;

    //private Long updateTime;

    //private Long deletionTime;

    private String firstname;

    private String lastname;

    //getters and setters omitted for brevity

}
