package com.wbarra.profileapi.domain.entities;

import java.time.LocalDate;

public class User {
    private Integer userId;

    private String identicationNumber;

    private String name;

    private TypeDocument typeDocument;

    private String mail;

    private String phone;

    private Address address;

    private String skill;

    private Boolean isChangeOfResidence;

    private LocalDate birthday;

    private Integer age;

    public String getIdenticationNumber() {
        return identicationNumber;
    }

    public void setIdenticationNumber(String identicationNumber) {
        this.identicationNumber = identicationNumber;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeDocument getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(TypeDocument typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Boolean getChangeOfResidence() {
        return isChangeOfResidence;
    }

    public void setChangeOfResidence(Boolean changeOfResidence) {
        isChangeOfResidence = changeOfResidence;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
