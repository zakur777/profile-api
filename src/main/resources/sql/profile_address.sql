create table address
(
    id_address  int auto_increment
        primary key,
    city        varchar(255) null,
    country     varchar(255) null,
    postal_code varchar(255) null,
    street      varchar(255) null,
    estado      varchar(255) null,
    updated_at  datetime     null,
    created_at  datetime     not null
)
    engine = MyISAM
    auto_increment = 10;

INSERT INTO profile.address (id_address, city, country, postal_code, street, estado, updated_at, created_at) VALUES (1, 'Santiago', 'Chile', '00001', 'Calle 01 casa A, Nunoa', '1', '2022-09-04 17:34:08', '2022-09-04 17:34:17');
INSERT INTO profile.address (id_address, city, country, postal_code, street, estado, updated_at, created_at) VALUES (2, 'Santiago', 'Chile', '11111', 'Calle 3500 departamento 315 torre b, Providencia', '1', '2022-09-04 17:34:20', '2022-09-04 17:34:24');
INSERT INTO profile.address (id_address, city, country, postal_code, street, estado, updated_at, created_at) VALUES (3, 'Santiago', 'Chile', '11112', 'Calle Super 2000 casa Z, Puente Alto', '1', '2022-09-04 17:34:27', '2022-09-04 17:34:30');
INSERT INTO profile.address (id_address, city, country, postal_code, street, estado, updated_at, created_at) VALUES (5, 'Santiago', 'Chile', '11114', 'Calle de Prueba 1000 casa j, Lo Barnechea', '1', '2022-09-04 17:34:34', '2022-09-04 17:34:37');
INSERT INTO profile.address (id_address, city, country, postal_code, street, estado, updated_at, created_at) VALUES (6, 'Puerto Montt', 'Chile', '11115', 'Calle de Prueba 302 casa p, Valle Bello', '1', '2022-09-04 17:34:40', '2022-09-04 17:34:45');
INSERT INTO profile.address (id_address, city, country, postal_code, street, estado, updated_at, created_at) VALUES (7, 'Viña del Mar', 'Chile', '11116', 'Uno Norte 3009 departamento 301 toore a, Reñaca Alto', '1', '2022-09-04 17:34:56', '2022-09-04 17:34:59');
INSERT INTO profile.address (id_address, city, country, postal_code, street, estado, updated_at, created_at) VALUES (8, 'Temuco', 'Chile', '11117', 'Calle de Prueba 4400 departamento 901 toore a, Temuquito', '1', '2022-09-04 17:35:02', '2022-09-04 17:35:05');
INSERT INTO profile.address (id_address, city, country, postal_code, street, estado, updated_at, created_at) VALUES (9, 'Ciudad Prueba', 'Pais Prueba', '22222', 'Calle de Prueba 22222 casa j, Lo Prueba', '1', '2022-09-04 17:35:08', '2022-09-04 17:35:11');
INSERT INTO profile.address (id_address, city, country, postal_code, street, estado, updated_at, created_at) VALUES (10, 'Ciudad Prueba2', 'Pais Prueba', '3', 'Calle de Prueba 33333 casa 20, Lo Prueba2', '1', '2022-09-04 17:35:08', '2022-09-04 17:35:11');
