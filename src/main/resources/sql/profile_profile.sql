create table profile
(
    id_profile int auto_increment
        primary key,
    about_me   varchar(255) null,
    created_at datetime     not null,
    estado     varchar(255) null,
    updated_at datetime     null
)
    engine = MyISAM
    auto_increment = 13;

INSERT INTO profile.profile (id_profile, about_me, created_at, estado, updated_at) VALUES (1, 'Soy un apasionado por la tecnologia', '2022-09-04 17:41:42', '1', '2022-09-04 17:41:46');
INSERT INTO profile.profile (id_profile, about_me, created_at, estado, updated_at) VALUES (9, 'Me encanta la pirateria y los emuladores', '2022-09-04 17:41:50', '1', '2022-09-04 17:42:14');
INSERT INTO profile.profile (id_profile, about_me, created_at, estado, updated_at) VALUES (2, 'me encanta participar de las meetings', '2022-09-04 17:41:53', '1', '2022-09-04 17:42:21');
INSERT INTO profile.profile (id_profile, about_me, created_at, estado, updated_at) VALUES (3, 'Soy un experto en inteligencia artificial', '2022-09-04 17:41:57', '1', '2022-09-04 17:42:24');
INSERT INTO profile.profile (id_profile, about_me, created_at, estado, updated_at) VALUES (10, 'Me encanta salir de viaje y escuchar musica', '2022-09-04 17:41:59', '1', '2022-09-04 17:42:27');
INSERT INTO profile.profile (id_profile, about_me, created_at, estado, updated_at) VALUES (8, 'Otro profile para probar', '2022-09-04 17:42:02', '1', '2022-09-04 17:42:30');
INSERT INTO profile.profile (id_profile, about_me, created_at, estado, updated_at) VALUES (11, 'Me encatan los animales y la comida vegetariana', '2022-09-04 17:42:05', '1', '2022-09-04 17:42:32');
INSERT INTO profile.profile (id_profile, about_me, created_at, estado, updated_at) VALUES (12, 'Otro profile para probar las VALIDACIONES', '2022-09-04 17:42:09', '1', '2022-09-04 17:42:35');
INSERT INTO profile.profile (id_profile, about_me, created_at, estado, updated_at) VALUES (13, 'Otro profile para probar TEST', '2022-09-04 17:42:09', '1', '2022-09-04 17:42:35');
