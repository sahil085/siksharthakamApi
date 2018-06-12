package com.IyfGZB.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Lectures {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String lectureTitle;

    @Column(unique = true)
    private String lectureURL;

    private Date lectureDate;

    private String lectureVenue;

    private String lectureCity;

    private LectCategories lectureCategory;

    private String lectureSpeaker;

    private double lectureAvgRating;

    private String lectureLang;

    private Integer lectureviews;

    private Date lectureDateUploaded;

    private Date lectureDateUpdatedOn;

    private UserInfo lectureUploadedBy;

    private UserInfo lectureUpdatedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLectureTitle() {
        return lectureTitle;
    }

    public void setLectureTitle(String lectureTitle) {
        this.lectureTitle = lectureTitle;
    }

    public String getLectureURL() {
        return lectureURL;
    }

    public void setLectureURL(String lectureURL) {
        this.lectureURL = lectureURL;
    }

    public Date getLectureDate() {
        return lectureDate;
    }

    public void setLectureDate(Date lectureDate) {
        this.lectureDate = lectureDate;
    }

    public String getLectureVenue() {
        return lectureVenue;
    }

    public void setLectureVenue(String lectureVenue) {
        this.lectureVenue = lectureVenue;
    }

    public String getLectureCity() {
        return lectureCity;
    }

    public void setLectureCity(String lectureCity) {
        this.lectureCity = lectureCity;
    }

    public LectCategories getLectureCategory() {
        return lectureCategory;
    }

    public void setLectureCategory(LectCategories lectureCategory) {
        this.lectureCategory = lectureCategory;
    }

    public String getLectureSpeaker() {
        return lectureSpeaker;
    }

    public void setLectureSpeaker(String lectureSpeaker) {
        this.lectureSpeaker = lectureSpeaker;
    }

    public double getLectureAvgRating() {
        return lectureAvgRating;
    }

    public void setLectureAvgRating(double lectureAvgRating) {
        this.lectureAvgRating = lectureAvgRating;
    }

    public String getLectureLang() {
        return lectureLang;
    }

    public void setLectureLang(String lectureLang) {
        this.lectureLang = lectureLang;
    }

    public Integer getLectureviews() {
        return lectureviews;
    }

    public void setLectureviews(Integer lectureviews) {
        this.lectureviews = lectureviews;
    }

    public Date getLectureDateUploaded() {
        return lectureDateUploaded;
    }

    public void setLectureDateUploaded(Date lectureDateUploaded) {
        this.lectureDateUploaded = lectureDateUploaded;
    }

    public Date getLectureDateUpdatedOn() {
        return lectureDateUpdatedOn;
    }

    public void setLectureDateUpdatedOn(Date lectureDateUpdatedOn) {
        this.lectureDateUpdatedOn = lectureDateUpdatedOn;
    }

    public UserInfo getLectureUploadedBy() {
        return lectureUploadedBy;
    }

    public void setLectureUploadedBy(UserInfo lectureUploadedBy) {
        this.lectureUploadedBy = lectureUploadedBy;
    }

    public UserInfo getLectureUpdatedBy() {
        return lectureUpdatedBy;
    }

    public void setLectureUpdatedBy(UserInfo lectureUpdatedBy) {
        this.lectureUpdatedBy = lectureUpdatedBy;
    }
}
