create table "order"
(
    id                 integer primary key,
    creation_date      timestamp with time zone not null,
    last_modified_date timestamp with time zone,
    pet_id             integer                  not null,
    quantity           integer                  not null,
    ship_date          timestamp with time zone,
    status             varchar,
    complete           boolean default false
);

alter table "order"
    add constraint fk_order_on_pet foreign key (pet_id) references pet (id);
