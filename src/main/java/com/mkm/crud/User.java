package com.mkm.crud;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;


//    public User(String name) {
//        this.name = name;
//    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
