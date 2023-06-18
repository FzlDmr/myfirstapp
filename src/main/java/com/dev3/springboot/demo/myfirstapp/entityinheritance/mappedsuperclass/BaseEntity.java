package com.dev3.springboot.demo.myfirstapp.entityinheritance.mappedsuperclass;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@MappedSuperclass
abstract class BaseEntity {

    @Id
    private Long id;

    @Column(nullable = false)
    private boolean deleted = false;

    @Column(nullable = false)
    private Long creationTime;

    private Long updateTime;

    private Long deletionTime;

    //getters and setters omitted for brevity

}
