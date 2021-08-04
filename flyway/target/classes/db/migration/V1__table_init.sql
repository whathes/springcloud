use springcloud;
create table if not exists init_table(
    id varchar(32) not null,
    content varchar(255) not null
) engine=InnoDB;