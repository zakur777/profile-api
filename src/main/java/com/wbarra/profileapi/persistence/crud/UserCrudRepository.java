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
            "users.id_profile, " +
            "users.estado, " +
            "users.created_at, " +
            "users.updated_at " +
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
            "users.birthday, " +
            "users.age, " +
            "users.id_profile, " +
            "users.estado, " +
            "users.created_at, " +
            "users.updated_at " , nativeQuery = true)
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
            "users.id_profile, " +
            "users.estado, " +
            "users.created_at, " +
            "users.updated_at " +
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
            "users.birthday, " +
            "users.age, " +
            "users.id_profile, " +
            "users.estado, " +
            "users.created_at, " +
            "users.updated_at " , nativeQuery = true)
    List<UserDAO> finByProfileCityOrCountry(@Param("city") String city, @Param("country") String country);

    @Query(value = "select * from users where is_change_of_residence in(1)", nativeQuery = true)
    List<UserDAO> findChangeOfResidence();

    @Query(value = "select us.* " +
            "from users us " +
            "inner join profile p on us.id_profile = p.id_profile " +
            "inner join experiences e on p.id_profile = e.id_profile " +
            "group by us.id_user " +
            "having sum(distinct e.years_of_experience) > :years", nativeQuery = true)
    List<UserDAO> findAllUsersPeopleWithMoreThanCertainYearsOfExperience(@Param("years") Integer years);
}
