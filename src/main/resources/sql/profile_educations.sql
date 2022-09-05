create table educations
(
    id_education       int auto_increment
        primary key,
    description        varchar(255) null,
    end_date           date         null,
    institution_name   varchar(255) null,
    name_of_title      varchar(255) null,
    id_profile         int          null,
    start_date         date         null,
    created_at         datetime     not null,
    estado             varchar(255) null,
    updated_at         datetime     null,
    id_education_level int          null
)
    engine = MyISAM
    auto_increment = 14;

create index FKbii72q9xqrmfvwkxhm8d4wiy0
    on educations (id_profile);

create index FKmgyutpbv889bl1ylmr9j15rxf
    on educations (id_education_level);

INSERT INTO profile.educations (id_education, description, end_date, institution_name, name_of_title, id_profile, start_date, created_at, estado, updated_at, id_education_level) VALUES (6, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2018-07-22', 'Universidad1', 'Ingenieria en informatica', 1, '2014-07-22', '2022-09-03 02:42:37', '1', '2022-09-03 02:42:37', 6);
INSERT INTO profile.educations (id_education, description, end_date, institution_name, name_of_title, id_profile, start_date, created_at, estado, updated_at, id_education_level) VALUES (5, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2013-07-22', 'Secundaria1', 'Enseñanza media', 1, '2009-07-22', '2022-09-03 02:40:26', '1', '2022-09-03 02:40:26', 5);
INSERT INTO profile.educations (id_education, description, end_date, institution_name, name_of_title, id_profile, start_date, created_at, estado, updated_at, id_education_level) VALUES (7, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2020-07-22', 'Borrar1 MOdificado', 'Para Borrar Modificado', 1, '2018-07-22', '2022-09-03 02:44:16', '1', '2022-09-03 02:49:04', 9);
INSERT INTO profile.educations (id_education, description, end_date, institution_name, name_of_title, id_profile, start_date, created_at, estado, updated_at, id_education_level) VALUES (8, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2018-07-22', 'Universidad2', 'Ingenieria en informatica', 2, '2014-07-22', '2022-09-03 02:42:37', '1', '2022-09-03 02:42:37', 6);
INSERT INTO profile.educations (id_education, description, end_date, institution_name, name_of_title, id_profile, start_date, created_at, estado, updated_at, id_education_level) VALUES (9, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2018-07-22', 'Universidad3', 'Ingenieria en informatica', 3, '2014-07-22', '2022-09-03 02:42:37', '1', '2022-09-03 02:42:37', 6);
INSERT INTO profile.educations (id_education, description, end_date, institution_name, name_of_title, id_profile, start_date, created_at, estado, updated_at, id_education_level) VALUES (10, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2018-07-22', 'Universidad4', 'Diseño Grafico', 8, '2014-07-22', '2022-09-03 02:42:37', '1', '2022-09-03 02:42:37', 6);
INSERT INTO profile.educations (id_education, description, end_date, institution_name, name_of_title, id_profile, start_date, created_at, estado, updated_at, id_education_level) VALUES (11, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2018-07-22', 'Universidad5', 'Diseño Grafico', 9, '2014-07-22', '2022-09-03 02:42:37', '1', '2022-09-03 02:42:37', 6);
INSERT INTO profile.educations (id_education, description, end_date, institution_name, name_of_title, id_profile, start_date, created_at, estado, updated_at, id_education_level) VALUES (12, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2018-07-22', 'Universidad6', 'Diseño Grafico', 10, '2014-07-22', '2022-09-03 02:42:37', '1', '2022-09-03 02:42:37', 6);
INSERT INTO profile.educations (id_education, description, end_date, institution_name, name_of_title, id_profile, start_date, created_at, estado, updated_at, id_education_level) VALUES (13, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2018-07-22', 'Universidad7', 'Diseño Grafico', 11, '2014-07-22', '2022-09-03 02:42:37', '1', '2022-09-03 02:42:37', 6);
