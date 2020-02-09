package com.datazone.models;

import javax.persistence.*;

@Entity
@Table(name="kit")
public class Kit {

    @Id
    @Column(name="id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(name="code", nullable = false, columnDefinition = "char(10)", unique = true)
    private String code;
    @Column(name="description")
    private String description;

    public Kit() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
