package com.IyfGZB.domain;

import javax.persistence.*;

@Entity
public class LectureRating {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer lectureRate;

    @ManyToOne(cascade=CascadeType.ALL)
    private Lectures lecture;

//    @ManyToOne(cascade=CascadeType.ALL)
//    @JoinTable(name=("ratings_user"),
//            joinColumns = {@JoinColumn(name=("rating_id"), referencedColumnName=("id"))},
//            inverseJoinColumns = {@JoinColumn(name=("user_id"), referencedColumnName=("id"))}
//    )
    @ManyToOne(cascade = CascadeType.ALL)
    private UserInfo userInfo;



}
