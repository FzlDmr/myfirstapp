package com.dev3.springboot.demo.myfirstapp.entityinheritance.joinedtable;

import jakarta.persistence.Entity;

@Entity
class Glasses extends BaseItem {

    private String brand;

    private String type;

}
