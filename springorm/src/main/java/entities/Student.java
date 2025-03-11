package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
@Entity
@Table(name = "student_details")
public class Student {
    @Id
    @Column(name = "student_id")
    private int id;
    @Column(name = "student_name")
    private String name;
    @Column(name = "student_city")
    private String studentCity;
    
    public Student(int id, String name, String studentCity) {
        this.id = id;
        this.name = name;
        this.studentCity = studentCity;
    }

    public Student() {
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentCity() {
        return this.studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", studentCity='" + getStudentCity() + "'" +
            "}";
    }

}

