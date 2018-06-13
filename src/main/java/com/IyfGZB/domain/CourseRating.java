package com.IyfGZB.domain;

import javax.persistence.*;

@Entity
public class CourseRating {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer courseRate;

    @ManyToOne(cascade=CascadeType.ALL)
    private Course course;

    @ManyToOne(cascade = CascadeType.ALL)
    private UserInfo userInfo;

}
