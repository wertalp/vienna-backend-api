package ch.wertal.viennabackendapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="COMPANY")
public class Company {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private Long id ;
        @Column(name="COMPANY_NAME", length=50, nullable=false, unique=false)
        private String companyName;

        @JsonIgnore
        @OneToMany
        private List<Event> events = new ArrayList<Event>();

        @Column
        private String mobileNumber;
        @Column
        private String contactName;
        @Column
        private String email;
        @Column
        private String street;
        @Column
        private String plz;
        @Column
        private String city;
        @Column
        private String branche;



        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getCompanyName() {
                return companyName;
        }

        public void setCompanyName(String companyName) {
                this.companyName = companyName;
        }

        public List<Event> getEvents() {
                return events;
        }

        public void setEvents(List<Event> events) {
                this.events = events;
        }

        public String getMobileNumber() {
                return mobileNumber;
        }

        public void setMobileNumber(String mobileNumber) {
                this.mobileNumber = mobileNumber;
        }

        public String getContactName() {
                return contactName;
        }

        public void setContactName(String contactName) {
                this.contactName = contactName;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getStreet() {
                return street;
        }

        public void setStreet(String street) {
                this.street = street;
        }

        public String getPlz() {
                return plz;
        }

        public void setPlz(String plz) {
                this.plz = plz;
        }

        public String getCity() {
                return city;
        }

        public void setCity(String city) {
                this.city = city;
        }

        public String getBranche() {
                return branche;
        }

        public void setBranche(String branche) {
                this.branche = branche;
        }
}

