package com.IyfGZB.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class LectureCategories {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String lectureCategoryName;

    private Date lectureCategoryCreatedOn;

    private Date lectureCategoryUpdatedOn;

    private UserInfo lectureCategoryCreatedBy;

    private UserInfo lectureCategoryUpdatedBy;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinTable(name="categories_lectures",
            joinColumns = {@JoinColumn(name="category_id", referencedColumnName="id")},
            inverseJoinColumns = {@JoinColumn(name="lecture_id", referencedColumnName="id")}
    )
    private Lectures lecture;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLectureCategoryName() {
        return lectureCategoryName;
    }

    public void setLectureCategoryName(String lectureCategoryName) {
        this.lectureCategoryName = lectureCategoryName;
    }

    public Date getLectureCategoryCreatedOn() {
        return lectureCategoryCreatedOn;
    }

    public void setLectureCategoryCreatedOn(Date lectureCategoryCreatedOn) {
        this.lectureCategoryCreatedOn = lectureCategoryCreatedOn;
    }

    public Date getLectureCategoryUpdatedOn() {
        return lectureCategoryUpdatedOn;
    }

    public void setLectureCategoryUpdatedOn(Date lectureCategoryUpdatedOn) {
        this.lectureCategoryUpdatedOn = lectureCategoryUpdatedOn;
    }

    public UserInfo getLectureCategoryCreatedBy() {
        return lectureCategoryCreatedBy;
    }

    public void setLectureCategoryCreatedBy(UserInfo lectureCategoryCreatedBy) {
        this.lectureCategoryCreatedBy = lectureCategoryCreatedBy;
    }

    public UserInfo getLectureCategoryUpdatedBy() {
        return lectureCategoryUpdatedBy;
    }

    public void setLectureCategoryUpdatedBy(UserInfo lectureCategoryUpdatedBy) {
        this.lectureCategoryUpdatedBy = lectureCategoryUpdatedBy;
    }
}
