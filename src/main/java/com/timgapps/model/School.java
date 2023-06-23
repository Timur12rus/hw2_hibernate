package com.timgapps.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "school")
public class School implements Serializable {

    @Id
    @OneToOne
    @JoinColumn(name = "director_id", referencedColumnName = "id")
    private Director director;

    @Column(name = "school")
    private String schoolName;

    public School(Director director, String schoolName) {
        this.director = director;
        this.schoolName = schoolName;
    }

    public School() {

    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "School{" +
                "director=" + director +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
