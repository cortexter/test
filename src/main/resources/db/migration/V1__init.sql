create table Todo (
        id int8 not null,
        date_insert timestamp not null,
        date_update timestamp,
        text varchar(255) not null,        
        primary key (id)
    );

    --SEQ
    create sequence TODO_SEQ start 1 increment 1;