package br.com.arcotech.school_api.model.entity;

import jakarta.persistence.*;

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_id_seq")
    int id;
    String name;
    String age;
    @JoinColumn(name = "classroom_id")
    @ManyToOne
    Classroom classroom;

}
