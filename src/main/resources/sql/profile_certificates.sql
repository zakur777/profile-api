create table certificates
(
    id_certificate     int auto_increment
        primary key,
    description        varchar(255) null,
    end_date           date         null,
    institution        varchar(255) null,
    name               varchar(255) null,
    id_profile         int          null,
    start_date         date         null,
    created_at         datetime     not null,
    estado             varchar(255) null,
    updated_at         datetime     null,
    id_education_level int          null
)
    engine = MyISAM
    auto_increment = 10;

create index FKbeb27pisyuuuerx8eo8tdw0cs
    on certificates (id_education_level);

create index FKd0ww7dt89prd4eqc1bsgx0nub
    on certificates (id_profile);

INSERT INTO profile.certificates (id_certificate, description, end_date, institution, name, id_profile, start_date, created_at, estado, updated_at, id_education_level) VALUES (1, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2022-08-15', 'Centro Educacional 2', 'Certificado2', 1, '2019-08-22', '2022-09-03 04:02:54', '1', '2022-09-03 04:07:38', 3);
INSERT INTO profile.certificates (id_certificate, description, end_date, institution, name, id_profile, start_date, created_at, estado, updated_at, id_education_level) VALUES (2, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2022-08-15', 'Centro Educacional 2', 'Certificado2', 1, '2019-08-22', '2022-09-03 04:04:08', '1', '2022-09-03 04:04:08', 2);
INSERT INTO profile.certificates (id_certificate, description, end_date, institution, name, id_profile, start_date, created_at, estado, updated_at, id_education_level) VALUES (3, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2022-08-15', 'Centro Educacional 3 Para Borrar', 'Certificado3 Para Borrar', 1, '2019-08-22', '2022-09-03 04:13:12', '0', '2022-09-03 04:14:03', 10);
INSERT INTO profile.certificates (id_certificate, description, end_date, institution, name, id_profile, start_date, created_at, estado, updated_at, id_education_level) VALUES (4, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2022-08-15', 'Centro Educacional 4', 'Certificado4', 2, '2019-08-22', '2022-09-03 04:13:12', '1', '2022-09-03 04:14:03', 2);
INSERT INTO profile.certificates (id_certificate, description, end_date, institution, name, id_profile, start_date, created_at, estado, updated_at, id_education_level) VALUES (5, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2022-08-15', 'Centro Educacional 5', 'Certificado5', 3, '2019-08-22', '2022-09-03 04:13:12', '1', '2022-09-03 04:14:03', 3);
INSERT INTO profile.certificates (id_certificate, description, end_date, institution, name, id_profile, start_date, created_at, estado, updated_at, id_education_level) VALUES (6, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2022-08-15', 'Centro Educacional 6', 'Certificado6', 8, '2019-08-22', '2022-09-03 04:13:12', '1', '2022-09-03 04:14:03', 12);
INSERT INTO profile.certificates (id_certificate, description, end_date, institution, name, id_profile, start_date, created_at, estado, updated_at, id_education_level) VALUES (7, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2022-08-15', 'Centro Educacional 7', 'Certificado7', 9, '2019-08-22', '2022-09-03 04:13:12', '1', '2022-09-03 04:14:03', 13);
INSERT INTO profile.certificates (id_certificate, description, end_date, institution, name, id_profile, start_date, created_at, estado, updated_at, id_education_level) VALUES (8, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2022-08-15', 'Centro Educacional 8', 'Certificado8', 10, '2019-08-22', '2022-09-03 04:13:12', '1', '2022-09-03 04:14:03', 11);
INSERT INTO profile.certificates (id_certificate, description, end_date, institution, name, id_profile, start_date, created_at, estado, updated_at, id_education_level) VALUES (9, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2022-08-15', 'Centro Educacional 9', 'Certificado9', 11, '2019-08-22', '2022-09-03 04:13:12', '1', '2022-09-03 04:14:03', 12);
