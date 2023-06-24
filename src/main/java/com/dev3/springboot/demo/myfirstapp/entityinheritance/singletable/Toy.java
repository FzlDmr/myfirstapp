package com.dev3.springboot.demo.myfirstapp.entityinheritance.singletable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Toy extends BaseItem {

    private String categoryName;



}