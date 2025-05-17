create table if not exists genres
(
    id   int auto_increment primary key,
    name varchar(255) not null
);
create table if not exists movies
(
    id           int auto_increment primary key,
    name         varchar(255)      not null,
    poster       varchar(255)      not null,
    description  varchar(5000)     not null,
    trailer      varchar(255)      null,
    release_date date              not null,
    vote_average double  default 5 null,
    vote_count   int     default 0 null,
    backdrop     varchar(255)      null,
    status       varchar(255)      null
);

create table if not exists movie_genres
(
    id       int auto_increment primary key,
    movie_id int not null,
    genre_id int not null,
    foreign key (movie_id) references movies (id),
    foreign key (genre_id) references genres (id)
);