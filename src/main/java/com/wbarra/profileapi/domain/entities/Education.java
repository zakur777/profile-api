package com.wbarra.profileapi.domain.entities;

import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
public class Education {
    private Integer educationId;

    private String institutionName;

    private String description;

    private LocalDate startDate;

    private LocalDate endDate;

    private String nameOfTitle;

    private LevelEducation levelEducation;

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
}
