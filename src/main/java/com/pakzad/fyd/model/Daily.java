package com.pakzad.fyd.model;

import javax.persistence.*;
import java.util.Date;

/**
 * @author ramin pakzad (rpakzadmanesh@gmail.com) on 7/13/2018.
 */
@Entity
@Table
public class Daily {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal( value = TemporalType.DATE)
    private Date date;

    private String thank1;
    private String thank2;
    private String thank3;
    private String thank4;
    private String thank5;

    private String plan1;
    private String plan2;
    private String plan3;
    private String plan4;
    private String plan5;

    private String emphasis1;
    private String emphasis2;
    private String emphasis3;

    private String happeing1;
    private String happeing2;
    private String happeing3;

    private String tomorrow1;
    private String tomorrow2;
    private String tomorrow3;











}
