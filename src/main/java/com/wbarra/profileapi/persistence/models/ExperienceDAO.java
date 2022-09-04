package com.wbarra.profileapi.persistence.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDate;

@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "experiences")
public class ExperienceDAO extends BaseDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_experience")
    private Integer experienceId;

    @Column(name = "position_name")
    private String positionName;

    @Column(name = "company_name")
    private String companyName;

    @JsonFormat(pattern = "dd-MM-yyyy")
    @Column(name = "start_date")
    private LocalDate startDate;

    @JsonFormat(pattern = "dd-MM-yyyy")
    @Column(name = "end_date")
    private LocalDate endDate;

    private String country;

    private String description;

    @Column(name = "id_profile")
    private Integer profileId;

    @ManyToOne
    @JoinColumn(name = "id_profile", insertable = false, updatable = false)
    private ProfileDAO profile;

    @Column(name = "years_of_experience")
    private Integer yearsOfExperience;

    public Integer getExperienceId() {
        return experienceId;
    }

    public void setExperienceId(Integer experienceId) {
        this.experienceId = experienceId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
