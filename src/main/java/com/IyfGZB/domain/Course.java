package com.IyfGZB.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String courseName;

    private Date courseCreatedDate;

    private Date courseUpdatedDate;

    private String vedicLevel;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = ("course_lectures"),
            joinColumns = {@JoinColumn(name = ("course_id"), referencedColumnName = ("id"))},
            inverseJoinColumns = {@JoinColumn(name = ("lecture_id"), referencedColumnName = ("id"))}
    )
    Set<Lectures> lectures;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = ("course_books"),
            joinColumns = {@JoinColumn(name = ("course_id"), referencedColumnName = ("id"))},
            inverseJoinColumns = {@JoinColumn(name = ("book_id"), referencedColumnName = ("id"))}
    )
    private Set<Book> courseBooks;

    private double courseAvgRating;

    private boolean isActive;

    private UserInfo courseUploadedBy;

    private UserInfo courseUpdatedBy;

    private String courseLang;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Date getCourseCreatedDate() {
        return courseCreatedDate;
    }

    public void setCourseCreatedDate(Date courseCreatedDate) {
        this.courseCreatedDate = courseCreatedDate;
    }

    public Date getCourseUpdatedDate() {
        return courseUpdatedDate;
    }

    public void setCourseUpdatedDate(Date courseUpdatedDate) {
        this.courseUpdatedDate = courseUpdatedDate;
    }

    public String getVedicLevel() {
        return vedicLevel;
    }

    public void setVedicLevel(String vedicLevel) {
        this.vedicLevel = vedicLevel;
    }

    public Set<Lectures> getLectures() {
        return lectures;
    }

    public void setLectures(Set<Lectures> lectures) {
        this.lectures = lectures;
    }

    public Set<Book> getCourseBooks() {
        return courseBooks;
    }

    public void setCourseBooks(Set<Book> courseBooks) {
        this.courseBooks = courseBooks;
    }

    public double getCourseAvgRating() {
        return courseAvgRating;
    }

    public void setCourseAvgRating(double courseAvgRating) {
        this.courseAvgRating = courseAvgRating;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public UserInfo getCourseUploadedBy() {
        return courseUploadedBy;
    }

    public void setCourseUploadedBy(UserInfo courseUploadedBy) {
        this.courseUploadedBy = courseUploadedBy;
    }

    public UserInfo getCourseUpdatedBy() {
        return courseUpdatedBy;
    }

    public void setCourseUpdatedBy(UserInfo courseUpdatedBy) {
        this.courseUpdatedBy = courseUpdatedBy;
    }

    public String getCourseLang() {
        return courseLang;
    }

    public void setCourseLang(String courseLang) {
        this.courseLang = courseLang;
    }
}