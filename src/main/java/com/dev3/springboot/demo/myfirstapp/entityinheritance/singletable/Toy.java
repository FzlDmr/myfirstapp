package com.dev3.springboot.demo.myfirstapp.entityinheritance.singletable;

import jakarta.persistence.Entity;


@Entity
public class Toy extends BaseItem {

    private String categoryName;



}