create table category
(
    id                 integer primary key,
    creation_date      timestamp with time zone not null,
    last_modified_date timestamp with time zone,
    name               varchar(100)             not null
        constraint category_name_unique unique
);
