create table pet_tag
(
    pet_id integer,
    tag_id integer,
    primary key (pet_id, tag_id)
);

alter table pet_tag
    add constraint fk_pet_tag_on_pet foreign key (pet_id) references pet (id);

alter table pet_tag
    add constraint fk_pet_tag_on_tag foreign key (tag_id) references tag (id);
