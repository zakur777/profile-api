create table users
(
    id_user                int auto_increment
        primary key,
    age                    int          null,
    birthday               date         null,
    identification_number  varchar(255) null,
    is_change_of_residence tinyint(1)   null,
    mail                   varchar(255) null,
    name                   varchar(255) null,
    phone                  varchar(255) null,
    skill                  varchar(255) null,
    id_type_document       int          null,
    id_address             int          null,
    id_profile             int          null,
    created_at             datetime     not null,
    estado                 varchar(255) null,
    updated_at             datetime     null
)
    engine = MyISAM
    auto_increment = 27;

create index FKj12sukkbaheeseduc7tn6x3gs
    on users (id_profile);

create index FKph7kb5x3ppek9v2b6efeouqbv
    on users (id_type_document);

create index FKqn6e1vfgae7l0vdporgpbuhf6
    on users (id_address);

INSERT INTO profile.users (id_user, age, birthday, identification_number, is_change_of_residence, mail, name, phone, skill, id_type_document, id_address, id_profile, created_at, estado, updated_at) VALUES (16, 36, '1986-03-28', '11111', 1, 'uno@mail1.com', 'Persona10', '+56965719283', 'Tengo habilidades en java, react, sql, mongodb, excel, tbleau y word', 1, 1, 1, '2022-09-04 17:55:27', '1', '2022-09-04 17:55:29');
INSERT INTO profile.users (id_user, age, birthday, identification_number, is_change_of_residence, mail, name, phone, skill, id_type_document, id_address, id_profile, created_at, estado, updated_at) VALUES (17, 37, '1985-03-28', '11112', 0, 'dos@mail.com', 'Persona11', '+56969845283', 'Tengo habilidades en java, react, sql, mongodb, excel, tbleau y word', 1, 2, 2, '2022-09-04 17:55:31', '1', '2022-09-04 17:55:32');
INSERT INTO profile.users (id_user, age, birthday, identification_number, is_change_of_residence, mail, name, phone, skill, id_type_document, id_address, id_profile, created_at, estado, updated_at) VALUES (18, 37, '1985-03-28', '11113', 1, 'tres@mail.com', 'Persona12', '+56990045283', 'Tengo habilidades en java, react, sql, mongodb, excel, tbleau y word', 1, 3, 3, '2022-09-04 17:55:33', '1', '2022-09-04 17:55:34');
INSERT INTO profile.users (id_user, age, birthday, identification_number, is_change_of_residence, mail, name, phone, skill, id_type_document, id_address, id_profile, created_at, estado, updated_at) VALUES (20, 37, '1985-03-28', '11114', 1, 'cuatro@mail.com', 'Persona13', '+56991045283', 'Tengo habilidades en python, angular, sql, mongodb, excel, tbleau y word', 1, 5, 8, '2022-09-04 17:55:35', '1', '2022-09-04 17:55:36');
INSERT INTO profile.users (id_user, age, birthday, identification_number, is_change_of_residence, mail, name, phone, skill, id_type_document, id_address, id_profile, created_at, estado, updated_at) VALUES (21, 37, '1985-03-28', '11114', 1, 'cinco@mail.com', 'Persona14', '+56992045283', 'Tengo habilidades en excel, tbleau y word', 1, 6, 9, '2022-09-04 17:55:37', '1', '2022-09-04 17:55:38');
INSERT INTO profile.users (id_user, age, birthday, identification_number, is_change_of_residence, mail, name, phone, skill, id_type_document, id_address, id_profile, created_at, estado, updated_at) VALUES (22, 37, '1985-03-28', '11114', 0, 'seis@mail.com', 'Persona15', '+56993045283', 'Tengo habilidades en after photoshop, effects, ux, ui, excel, tbleau y word', 1, 7, 10, '2022-09-04 17:55:39', '1', '2022-09-04 17:55:40');
INSERT INTO profile.users (id_user, age, birthday, identification_number, is_change_of_residence, mail, name, phone, skill, id_type_document, id_address, id_profile, created_at, estado, updated_at) VALUES (23, 37, '1985-03-28', '11114', 1, 'siete@mail.com', 'Persona16', '+56994545283', 'Tengo habilidades en photoshop, figma, ux, ui, excel, tbleau y word', 1, 8, 11, '2022-09-04 17:55:42', '1', '2022-09-04 17:55:43');
INSERT INTO profile.users (id_user, age, birthday, identification_number, is_change_of_residence, mail, name, phone, skill, id_type_document, id_address, id_profile, created_at, estado, updated_at) VALUES (26, 37, '1985-03-28', '8888888', 1, 'ocho@mail.com', 'PersonaValidaciones', '+56902045283', 'Tengo habilidades en java, react, sql, mongodb, excel, tbleau y word', 1, 9, 12, '2022-09-04 17:55:44', '1', '2022-09-04 17:55:45');
INSERT INTO profile.users (id_user, age, birthday, identification_number, is_change_of_residence, mail, name, phone, skill, id_type_document, id_address, id_profile, created_at, estado, updated_at) VALUES (27, 37, '1985-03-28', '8888889', 1, 'nueve@mail.com', 'PersonaTest', '+56900912283', 'Tengo habilidades en java, react, sql, mongodb, excel, tbleau y word', 1, 10, 13, '2022-09-04 18:57:46', '1', '2022-09-04 18:57:46');
