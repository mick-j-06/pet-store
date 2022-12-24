create table "user"
(
    id                 integer primary key,
    creation_date      timestamp with time zone not null,
    last_modified_date timestamp with time zone,
    username           varchar(50)              not null
        constraint user_username_unique unique,
    first_name         varchar,
    last_name          varchar                  not null,
    email              varchar
        constraint user_email_unique unique
);
