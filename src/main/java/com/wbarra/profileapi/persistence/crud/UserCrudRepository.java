package com.wbarra.profileapi.persistence.crud;

import com.wbarra.profileapi.persistence.models.UserDAO;
import org.hibernate.annotations.Where;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserCrudRepository extends CrudRepository<UserDAO, Integer> {
    List<UserDAO> findByTypeDocumentIdOrderByAgeAsc(Integer typeDocumentId);
    List<UserDAO> findByProfile_Certificates_educationLevelId(Integer educationLevelId);

    @Query(value = "select users.id_user, " +
            "users.identification_number, " +
            "users.id_type_document, " +
            "users.name, " +
            "users.mail, " +
            "users.phone, " +
            "users.id_address, " +
            "users.skill, " +
            "users.is_change_of_residence, " +
            "users.birthday, " +
            "users.age, " +
            "users.id_profile " +
            "from users inner join profile on users.id_profile = users.id_profile " +
            "inner join certificates on certificates.id_profile = profile.users.id_profile " +
            "inner join education_level el on certificates.id_education_level = el.id_education_level " +
            "inner join address a on users.id_address = a.id_address " +
            "where el.id_education_level in(2,3) " +
            "group by users.id_user, " +
            "users.identification_number, " +
            "users.id_type_document, " +
            "users.name, " +
            "users.mail, " +
            "users.phone, " +
            "users.id_address, " +
            "users.skill, " +
            "users.is_change_of_residence, " +
            "users.birthday, users.age, users.id_profile " , nativeQuery = true)
    List<UserDAO> findByProfileMasterAndDoctorate();


    @Query(value = " select users.id_user, " +
            "users.identification_number, " +
            "users.id_type_document, " +
            "users.name, " +
            "users.mail, " +
            "users.phone, " +
            "users.id_address, " +
            "users.skill, " +
            "users.is_change_of_residence, " +
            "users.birthday, " +
            "users.age, " +
            "users.id_profile " +
            "from profile.users inner join address a on users.id_address = a.id_address " +
            "where UPPER(a.city) like %:city% OR UPPER(a.country) like %:country% " +
            "group by users.id_user, " +
            "users.identification_number, " +
            "users.id_type_document, " +
            "users.name, " +
            "users.mail, " +
            "users.phone, " +
            "users.id_address, " +
            "users.skill, " +
            "users.is_change_of_residence, " +
            "users.birthday, users.age, users.id_profile ", nativeQuery = true)
    List<UserDAO> finByProfileCityOrCountry(@Param("city") String city, @Param("country") String country);

    @Query(value = "select * from users where is_change_of_residence in(1)", nativeQuery = true)
    List<UserDAO> findChangeOfResidence();
}
