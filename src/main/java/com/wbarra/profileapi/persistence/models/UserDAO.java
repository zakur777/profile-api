package com.wbarra.profileapi.persistence.models;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.wbarra.profileapi.persistence.validators.anotations.ValidAge;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@ValidAge(birthday = "birthday", age = "age")
@Entity
@Table(name = "users")
public class UserDAO extends BaseDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer userId;

    @NotEmpty(message = "The Identification number is required")
    @Column(name = "identification_number")
    private String identicationNumber;

    @NotEmpty(message = "The name is required")
    @Size(min = 4, max = 120, message = "The name must have at least {min} and at most {max} characters.")
    private String name;

    @NotNull(message = "The typeDocumentId is required")
    @Positive(message = "The typeDocumentId must be greater than zero")
    @Column(name = "id_type_document")
    private Integer typeDocumentId;

    @ManyToOne
    @JoinColumn(name = "id_type_document", insertable = false, updatable = false)
    private TypeDocumentDAO typeDocument;

    @NotEmpty(message = "The email is required")
    @Email
    private String mail;

    @Pattern(regexp = "^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$", message = "You must enter a valid phone number")
    private String phone;

    @NotNull(message = "The id_address is required")
    @Column(name = "id_address", nullable = false)
    private Integer addressId;
    @OneToOne
    @JoinColumn(name = "id_address", insertable = false, updatable = false)
    private AddressDAO address;

    @Size(min = 2, max = 255, message = "The skill must have at least {min} and at most {max} characters.")
    private String skill;

    @Column(name = "is_change_of_residence", nullable = false)
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean isChangeOfResidence;

    @Past
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate birthday;

    @NotNull(message = "The age is required")
    @Min(value = 18, message = "You must be 18 years of age or older")
    @Max(value = 100, message = "You cannot exceed 100 years of age")
    @Positive
    private Integer age;

    @Positive
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
