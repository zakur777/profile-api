package com.wbarra.profileapi.persistence.models;

import com.wbarra.profileapi.domain.entities.Address;
import com.wbarra.profileapi.domain.entities.TypeDocument;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "users")
public class UserDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer userId;

    @Column(name = "identification_number")
    private String identicationNumber;

    private String name;
    @Column(name = "id_type_document")
    private Integer typeDocumentId;

    @ManyToOne
    @JoinColumn(name = "id_type_document", insertable = false, updatable = false)
    private TypeDocumentDAO typeDocument;

    private String mail;

    private String phone;

    @OneToOne
    @JoinColumn(name = "id_address")
    private AddressDAO address;

    private String skill;

    @Column(name = "is_change_of_residence")
    private Boolean isChangeOfResidence;

    private LocalDate birthday;

    private Integer age;

    @OneToOne
    @JoinColumn(name = "id_profile")
    private ProfileDAO profile;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getIdenticationNumber() {
        return identicationNumber;
    }

    public void setIdenticationNumber(String identicationNumber) {
        this.identicationNumber = identicationNumber;
    }

    public Integer getTypeDocumentId() {
        return typeDocumentId;
    }

    public void setTypeDocumentId(Integer typeDocumentId) {
        this.typeDocumentId = typeDocumentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeDocumentDAO getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(TypeDocumentDAO typeDocument) {
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

    public AddressDAO getAddress() {
        return address;
    }

    public void setAddress(AddressDAO address) {
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

    public ProfileDAO getProfile() {
        return profile;
    }

    public void setProfile(ProfileDAO profile) {
        this.profile = profile;
    }
}
