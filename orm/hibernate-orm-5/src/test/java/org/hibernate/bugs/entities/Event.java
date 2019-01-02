package org.hibernate.bugs.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @Id @GeneratedValue
    private Long eventId;
    private String eventName;
    private Instant eventData;
    @OneToOne
    private User user;
}
