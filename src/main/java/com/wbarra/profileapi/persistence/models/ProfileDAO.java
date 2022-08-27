package com.wbarra.profileapi.persistence.models;

import com.wbarra.profileapi.domain.entities.Certificate;
import com.wbarra.profileapi.domain.entities.Education;
import com.wbarra.profileapi.domain.entities.Experience;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "profile")
public class ProfileDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profile")
    private Integer profileId;

    @OneToMany(mappedBy = "profile")
    private List<EducationDAO> educations;

    @OneToMany(mappedBy = "profile")
    private List<ExperienceDAO> experiences;

    @OneToMany(mappedBy = "profile")
    private List<CertificateDAO> certificates;

    @Column(name = "about_me")
    private String aboutMe;

    public Integer getProfileId() {
        return profileId;
    }

    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    public List<EducationDAO> getEducations() {
        return educations;
    }

    public void setEducations(List<EducationDAO> educations) {
        this.educations = educations;
    }

    public List<ExperienceDAO> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<ExperienceDAO> experiences) {
        this.experiences = experiences;
    }

    public List<CertificateDAO> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<CertificateDAO> certificates) {
        this.certificates = certificates;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }
}
