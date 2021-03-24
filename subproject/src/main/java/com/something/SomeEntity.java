package com.something;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

@Entity
public class SomeEntity {
    @Id
    @GeneratedValue
    Long id;

    @OneToMany
    @OrderColumn
    List<ChildEntity> children;

    public SomeEntity() {
    }

    public SomeEntity(List<ChildEntity> children) {
        this.children = new ArrayList<>(children);
    }
}
