create table experiences
(
    id_experience       int auto_increment
        primary key,
    company_name        varchar(255) null,
    country             varchar(255) null,
    description         varchar(255) null,
    end_date            date         null,
    position_name       varchar(255) null,
    id_profile          int          null,
    start_date          date         null,
    created_at          datetime     not null,
    estado              varchar(255) null,
    updated_at          datetime     null,
    years_of_experience int          null
)
    engine = MyISAM
    auto_increment = 11;

create index FKsba5j0d6yw5pe1opncrre925t
    on experiences (id_profile);

INSERT INTO profile.experiences (id_experience, company_name, country, description, end_date, position_name, id_profile, start_date, created_at, estado, updated_at, years_of_experience) VALUES (1, 'Funtual', 'Chile', 'is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2008-08-08', 'Desarrollador Jr', 1, '2005-01-21', '2022-09-04 17:46:00', '1', '2022-09-04 17:47:01', 3);
INSERT INTO profile.experiences (id_experience, company_name, country, description, end_date, position_name, id_profile, start_date, created_at, estado, updated_at, years_of_experience) VALUES (2, 'Sodimac', 'Chile', 'is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2016-07-22', 'Desarrollador Semi Senior', 1, '2008-08-15', '2022-09-04 17:46:31', '1', '2022-09-04 17:47:02', 8);
INSERT INTO profile.experiences (id_experience, company_name, country, description, end_date, position_name, id_profile, start_date, created_at, estado, updated_at, years_of_experience) VALUES (3, 'Sodimac', 'Chile', 'is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', null, 'Desarrollador Senior', 1, '2016-07-22', '2022-09-04 17:46:38', '1', '2022-09-04 17:47:03', 6);
INSERT INTO profile.experiences (id_experience, company_name, country, description, end_date, position_name, id_profile, start_date, created_at, estado, updated_at, years_of_experience) VALUES (5, 'Empresa1', 'Chile', 'is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2016-07-22', 'Desarrollador Semi Senior', 2, '2008-08-15', '2022-09-04 17:46:43', '1', '2022-09-04 17:47:04', 8);
INSERT INTO profile.experiences (id_experience, company_name, country, description, end_date, position_name, id_profile, start_date, created_at, estado, updated_at, years_of_experience) VALUES (6, 'Empresa2', 'Chile', 'is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2016-07-22', 'Desarrollador Jr', 3, '2008-08-15', '2022-09-04 17:46:48', '1', '2022-09-04 17:47:05', 8);
INSERT INTO profile.experiences (id_experience, company_name, country, description, end_date, position_name, id_profile, start_date, created_at, estado, updated_at, years_of_experience) VALUES (7, 'Empresa3', 'Chile', 'is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2016-07-22', 'Diseñador Grafico', 8, '2008-08-15', '2022-09-04 17:46:52', '1', '2022-09-04 17:47:06', 8);
INSERT INTO profile.experiences (id_experience, company_name, country, description, end_date, position_name, id_profile, start_date, created_at, estado, updated_at, years_of_experience) VALUES (8, 'Empresa4', 'Chile', 'is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2016-07-22', 'Maquetador', 9, '2008-08-15', '2022-09-04 17:46:53', '1', '2022-09-04 17:47:07', 8);
INSERT INTO profile.experiences (id_experience, company_name, country, description, end_date, position_name, id_profile, start_date, created_at, estado, updated_at, years_of_experience) VALUES (9, 'Empresa5', 'Chile', 'is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2016-07-22', 'Diseñador Interfaces de usuario', 10, '2008-08-15', '2022-09-04 17:46:54', '1', '2022-09-04 17:47:08', 8);
INSERT INTO profile.experiences (id_experience, company_name, country, description, end_date, position_name, id_profile, start_date, created_at, estado, updated_at, years_of_experience) VALUES (10, 'Empresa6', 'Chile', 'is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2016-07-22', 'Diseñador Interfaces de usuario', 11, '2008-08-15', '2022-09-04 17:46:55', '1', '2022-09-04 17:47:09', 8);
INSERT INTO profile.experiences (id_experience, company_name, country, description, end_date, position_name, id_profile, start_date, created_at, estado, updated_at, years_of_experience) VALUES (11, 'Prueba Borrar', 'Chile', 'is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s', '2022-07-22', 'Borrar', 13, '2020-07-22', '2022-09-04 19:41:30', '1', '2022-09-04 19:41:30', 2);
