create table pet
(
    id                 integer primary key,
    creation_date      timestamp with time zone not null,
    last_modified_date timestamp with time zone,
    category_id        integer
        constraint fk_pet_on_category references category (id),
    name               varchar                  not null
        constraint pet_name_unique unique,
    status             varchar
);