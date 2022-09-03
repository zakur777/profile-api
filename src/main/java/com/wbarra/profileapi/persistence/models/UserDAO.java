package com.wbarra.profileapi.persistence.models;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.Type;

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

    @Column(name = "id_address")
    private Integer addressId;
    @OneToOne
    @JoinColumn(name = "id_address", insertable = false, updatable = false)
    private AddressDAO address;

    private String skill;

    @Column(name = "is_change_of_residence", nullable = false)
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean isChangeOfResidence;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate birthday;

    private Integer age;

    @Column(name = "id_profile")
    private Integer profileId;

    @OneToOne
    @JoinColumn(name = "id_profile", insertable = false, updatable = false)
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

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
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

    public boolean getChangeOfResidence() {
        return isChangeOfResidence;
    }

    public void setChangeOfResidence(boolean changeOfResidence) {
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
