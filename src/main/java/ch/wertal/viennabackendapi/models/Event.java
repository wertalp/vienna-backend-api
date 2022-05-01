package ch.wertal.viennabackendapi.models;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name="EVENT")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Event implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name="title", length=50, nullable=false, unique=false)
    private String title;
    @Column
    private String description;
    @Column
    private Date booking_date;
    @Column
    private Date action_date;
    @Column
    private Time action_time;
    @Column
    private  String  status ;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Client client;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Company company;

    @Column
    private  Long  priority ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(Date booking_date) {
        this.booking_date = booking_date;
    }

    public Date getAction_date() {
        return action_date;
    }

    public void setAction_date(Date action_date) {
        this.action_date = action_date;
    }

    public Time getAction_time() {
        return action_time;
    }

    public void setAction_time(Time action_time) {
        this.action_time = action_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }
}
