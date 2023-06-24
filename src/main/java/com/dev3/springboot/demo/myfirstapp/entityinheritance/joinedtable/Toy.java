package com.dev3.springboot.demo.myfirstapp.entityinheritance.joinedtable;

import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
class Toy extends BaseItem {

    private BigDecimal price;

}