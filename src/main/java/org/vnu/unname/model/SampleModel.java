package org.vnu.unname.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "test")
public class SampleModel {
    @Id
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    public SampleModel() {

    }

    public SampleModel(UUID id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
