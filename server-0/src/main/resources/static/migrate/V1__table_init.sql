use springcloud;
create table if not exists 'init_table'(
    'id' varchar(32) character utf8 collate utf8_bin not null,
    'content' varchar(255) not null
) engine=InnerDB default charset=utf8 collate utf8_bin not null;