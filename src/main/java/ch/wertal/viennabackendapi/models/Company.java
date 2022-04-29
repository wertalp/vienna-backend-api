package ch.wertal.viennabackendapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="COMPANY")
public class Company {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private Long id;

        @Column(name="COMPANY_NAME", length=50, nullable=false, unique=false)
        private String name;

        @JsonIgnore
        @OneToMany
        private List<Event> events = new ArrayList<Event>();

        @Column
        private String firstName;
        @Column
        private String lastName;
        @Column
        private String email;
        @Column
        private String password;

}

