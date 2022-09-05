create table type_document
(
    id_type_document int auto_increment
        primary key,
    name             varchar(255) null,
    created_at       datetime     not null,
    estado           varchar(255) null,
    updated_at       datetime     null
)
    engine = MyISAM
    auto_increment = 5;

INSERT INTO profile.type_document (id_type_document, name, created_at, estado, updated_at) VALUES (1, 'rut', '2022-09-04 17:50:02', '1', '2022-09-04 17:50:07');
INSERT INTO profile.type_document (id_type_document, name, created_at, estado, updated_at) VALUES (2, 'visa', '2022-09-04 17:50:04', '1', '2022-09-04 17:50:08');
INSERT INTO profile.type_document (id_type_document, name, created_at, estado, updated_at) VALUES (3, 'pasaporte', '2022-09-04 17:50:05', '1', '2022-09-04 17:50:10');
