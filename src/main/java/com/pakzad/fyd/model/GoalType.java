package com.pakzad.fyd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Ramin Pakzad
 */
@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoalType implements Serializable {
    private static final long serialVersionUID = -1129808500656931181L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String description;
}
