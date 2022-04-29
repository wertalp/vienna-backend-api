package ch.wertal.viennabackendapi.models;


import lombok.*;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name="EVENT")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Event {

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


}
