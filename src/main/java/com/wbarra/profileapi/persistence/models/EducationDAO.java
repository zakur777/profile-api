package com.wbarra.profileapi.persistence.models;

import com.wbarra.profileapi.domain.entities.LevelEducation;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "educations")
public class EducationDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_education")
    private Integer educationId;

    @Column(name = "institution_name")
    private String institutionName;

    private String description;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "name_of_title")
    private String nameOfTitle;

    @Column(name = "level_education")
    @Enumerated(EnumType.STRING)
    private LevelEducation levelEducation;

    @Column(name = "id_profile")
    private Integer profileId;

    @ManyToOne
    @JoinColumn(name = "id_profile", insertable = false, updatable = false)
    private ProfileDAO profile;

    public Integer getEducationId() {
        return educationId;
    }

    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getNameOfTitle() {
        return nameOfTitle;
    }

    public void setNameOfTitle(String nameOfTitle) {
        this.nameOfTitle = nameOfTitle;
    }

    public LevelEducation getLevelEducation() {
        return levelEducation;
    }

    public void setLevelEducation(LevelEducation levelEducation) {
        this.levelEducation = levelEducation;
    }

    public Integer getProfileId() {
        return profileId;
    }

    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    public ProfileDAO getProfile() {
        return profile;
    }

    public void setProfile(ProfileDAO profile) {
        this.profile = profile;
    }
}
