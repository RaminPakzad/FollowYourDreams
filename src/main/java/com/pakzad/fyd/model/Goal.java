package com.pakzad.fyd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Ramin Pakzad
 */
@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goal implements Serializable {
    private static final long serialVersionUID = -7987946842805459979L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(value = TemporalType.DATE)
    private Date date;
    @ManyToOne
    private GoalType goalType;
    @Column
    private String description;
}
