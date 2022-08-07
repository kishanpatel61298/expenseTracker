package com.dal.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.persistence.Id;

@Document("category")
public class Category {
    @Id
    int catagoryId;
    String name;

    public Category(int catagoryId, String name) {
        this.catagoryId = catagoryId;
        this.name = name;
    }

    public int getCatagoryId() {
        return catagoryId;
    }

    public void setCatagoryId(int catagoryId) {
        this.catagoryId = catagoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
