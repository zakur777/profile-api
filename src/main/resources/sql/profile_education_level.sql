create table education_level
(
    id_education_level int auto_increment
        primary key,
    created_at         datetime     not null,
    estado             varchar(255) null,
    updated_at         datetime     null,
    degree             varchar(255) null
)
    engine = MyISAM
    auto_increment = 15;

INSERT INTO profile.education_level (id_education_level, created_at, estado, updated_at, degree) VALUES (1, '2022-09-02 23:26:17', '1', '2022-09-02 23:26:17', 'UNDERGRADUATE');
INSERT INTO profile.education_level (id_education_level, created_at, estado, updated_at, degree) VALUES (2, '2022-09-02 23:29:04', '1', '2022-09-02 23:29:04', 'Master');
INSERT INTO profile.education_level (id_education_level, created_at, estado, updated_at, degree) VALUES (3, '2022-09-02 23:30:58', '1', '2022-09-02 23:30:58', 'Doctorate');
INSERT INTO profile.education_level (id_education_level, created_at, estado, updated_at, degree) VALUES (4, '2022-09-02 23:34:03', '1', '2022-09-02 23:34:03', 'Elementary School');
INSERT INTO profile.education_level (id_education_level, created_at, estado, updated_at, degree) VALUES (5, '2022-09-02 23:34:33', '1', '2022-09-02 23:34:33', 'High School');
INSERT INTO profile.education_level (id_education_level, created_at, estado, updated_at, degree) VALUES (6, '2022-09-02 23:34:45', '1', '2022-09-02 23:34:45', 'University');
INSERT INTO profile.education_level (id_education_level, created_at, estado, updated_at, degree) VALUES (7, '2022-09-02 23:35:09', '0', '2022-09-03 02:45:14', 'College');
INSERT INTO profile.education_level (id_education_level, created_at, estado, updated_at, degree) VALUES (8, '2022-09-02 23:35:25', '1', '2022-09-02 23:35:25', 'PostGraduate');
INSERT INTO profile.education_level (id_education_level, created_at, estado, updated_at, degree) VALUES (9, '2022-09-02 23:38:31', '1', '2022-09-03 01:44:20', 'BORRAR');
INSERT INTO profile.education_level (id_education_level, created_at, estado, updated_at, degree) VALUES (10, '2022-09-02 23:38:31', '1', '2022-09-03 01:44:20', 'Full Stack Java');
INSERT INTO profile.education_level (id_education_level, created_at, estado, updated_at, degree) VALUES (11, '2022-09-02 23:38:31', '1', '2022-09-03 01:44:20', 'PreGraduate');
INSERT INTO profile.education_level (id_education_level, created_at, estado, updated_at, degree) VALUES (12, '2022-09-02 23:38:31', '1', '2022-09-03 01:44:20', 'UI UX Design');
INSERT INTO profile.education_level (id_education_level, created_at, estado, updated_at, degree) VALUES (13, '2022-09-02 23:38:31', '1', '2022-09-03 01:44:20', 'Photoshop');
INSERT INTO profile.education_level (id_education_level, created_at, estado, updated_at, degree) VALUES (14, '2022-09-02 23:38:31', '1', '2022-09-03 01:44:20', 'After Effects');
