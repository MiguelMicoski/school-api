package br.com.arcotech.school_api.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "clasroom")
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clasroom_id_seq")
    int id;
    String name;
    String shift;
    String grade;
    @JoinColumn(name = "school_id")
    @ManyToOne
    School school;

}
