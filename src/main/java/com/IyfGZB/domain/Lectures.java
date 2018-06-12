package com.IyfGZB.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Lectures {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "Title")
    String lectTitle;

    @Column(name = "URL", unique = true)
    String lectURL;

    @Column(name = "LectureDate")
    Date lectDate;

    @Column(name = "Venue")
    String venue;

    @Column(name = "City")
    String city;

    @Column(name = "Category")
    Category category;

    @Column(name = "Speaker")
    String speaker;

    @Column(name = "AvgRating")
    double avgRating;

    @Column(name = "Language")
    String lang;

    @Column(name = "Views")
    Integer views;

    @Column(name = "UploadedOn")
    Date uploadOn;

    @Column(name = "UpdatedOn")
    Date updateOn;

    @Column(name = "uploadedBy")
    User uploadedBy;

    @Column(name = "updatedBy")
    User updatedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLectTitle() {
        return lectTitle;
    }

    public void setLectTitle(String lectTitle) {
        this.lectTitle = lectTitle;
    }

    public String getLectURL() {
        return lectURL;
    }

    public void setLectURL(String lectURL) {
        this.lectURL = lectURL;
    }

    public Date getLectDate() {
        return lectDate;
    }

    public void setLectDate(Date lectDate) {
        this.lectDate = lectDate;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Date getUploadOn() {
        return uploadOn;
    }

    public void setUploadOn(Date uploadOn) {
        this.uploadOn = uploadOn;
    }

    public Date getUpdateOn() {
        return updateOn;
    }

    public void setUpdateOn(Date updateOn) {
        this.updateOn = updateOn;
    }

    public User getUploadedBy() {
        return uploadedBy;
    }

    public void setUploadedBy(User uploadedBy) {
        this.uploadedBy = uploadedBy;
    }

    public User getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(User updatedBy) {
        this.updatedBy = updatedBy;
    }
}
