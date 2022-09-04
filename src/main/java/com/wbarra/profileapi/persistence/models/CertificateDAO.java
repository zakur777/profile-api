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
@Table(name = "certificates")
public class CertificateDAO extends BaseDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_certificate")
    private Integer certificateId;

    private String name;

    private String description;


    @Column(name = "start_date")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate startDate;

    @Column(name = "end_date")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate endDate;

    private String institution;

    @Column(name = "id_profile")
    private Integer profileId;

    @ManyToOne
    @JoinColumn(name = "id_profile", insertable = false, updatable = false)
    private ProfileDAO profile;

    @Column(name = "id_education_level")
    private Integer educationLevelId;

    @OneToOne
    @JoinColumn(name = "id_education_level", insertable = false, updatable = false)
    private EducationLevelDAO educationLevel;

    public Integer getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(Integer certificateId) {
        this.certificateId = certificateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
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

    public Integer getEducationLevelId() {
        return educationLevelId;
    }

    public void setEducationLevelId(Integer educationLevelId) {
        this.educationLevelId = educationLevelId;
    }

    public EducationLevelDAO getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(EducationLevelDAO educationLevel) {
        this.educationLevel = educationLevel;
    }
}
