package com.IyfGZB.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Lectures {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String lectureTitle;

    @Column(unique = true)
    private String mp3URL;

    @Column(unique = true)
    private String downloadURL;

    private Date lectureDate;

    private String lectureVenue;

    private String lectureCity;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinTable(name=("lecture_categories"),
            joinColumns = {@JoinColumn(name=("lecture_id"), referencedColumnName=("id"))},
            inverseJoinColumns = {@JoinColumn(name=("category_id"), referencedColumnName=("id"))}
    )
    private Set<LectureCategories> lectureCategory;

    private String lectureSpeaker;

    private double lectureAvgRating;

    private String lectureLang;

    private Integer lectureviews;

    private Date lectureDateUploaded;

    private Date lectureDateUpdatedOn;

    public UserInfo lectureUploadedBy;

    public UserInfo lectureUpdatedBy;

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

    public Set<LectureCategories> getLectureCategory() {
        return lectureCategory;
    }

    public void setLectureCategory(Set<LectureCategories> lectureCategory) {
        this.lectureCategory = (Set<LectureCategories>) lectureCategory;
    }

    public String getMP3URL() {
        return mp3URL;
    }

    public void setMP3URL(String MP3URL) {
        this.mp3URL = MP3URL;
    }

    public String getDownloadURL() {
        return downloadURL;
    }

    public void setDownloadURL(String downloadURL) {
        this.downloadURL = downloadURL;
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