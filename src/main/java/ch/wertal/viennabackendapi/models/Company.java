package ch.wertal.viennabackendapi.models;

import javax.persistence.*;

@Entity
@Table(name="COMPANY")
public class Company {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private Long id;

        @Column(name="COMPANY_NAME", length=50, nullable=false, unique=false)
        private String name;

        @Column
        private String firstName;
        @Column
        private String lastName;
        @Column
        private String email;
        @Column
        private String password;

}

