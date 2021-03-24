package com.something;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ChildEntity{
    @Id
    @GeneratedValue
    Long id;

    String title;

    public ChildEntity() {
    }

    public ChildEntity(String title) {
        this.title = title;
    }
}
