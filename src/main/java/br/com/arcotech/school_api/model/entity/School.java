package br.com.arcotech.school_api.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "school")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "school_id_seq")
    int id;
    String name;
    String city;
    String state;

}
