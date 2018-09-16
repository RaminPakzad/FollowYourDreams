package com.pakzad.fyd.model;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Ramin Pakzad
 */
@Entity
@Table
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(value = TemporalType.DATE)
    private Date date;
    @ManyToOne
    private GoalType goalType;
}
