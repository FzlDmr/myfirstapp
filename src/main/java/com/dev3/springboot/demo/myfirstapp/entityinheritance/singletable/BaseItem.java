package com.dev3.springboot.demo.myfirstapp.entityinheritance.singletable;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
abstract class BaseItem {

    @Id
    private Long itemId;

    @Column(unique = true)
    private Long barcode;

    private BigDecimal price;



}
