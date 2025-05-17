create table if not exists provinces
(
    id   int auto_increment primary key,
    name varchar(255) not null
);

create table if not exists cinemas
(
    id          int auto_increment primary key,
    name        varchar(255) not null,
    address     varchar(255) not null,
    phone       varchar(255) not null,
    province_id int          not null,
    foreign key (province_id) references provinces (id)
);

create table if not exists photos
(
    id        int auto_increment primary key,
    url       varchar(255) not null,
    cinema_id int          not null,
    foreign key (cinema_id) references cinemas (id)
);

create table if not exists rooms
(
    id        int auto_increment primary key,
    name      varchar(255) not null,
    cinema_id int          not null,
    location  varchar(255) not null,
    foreign key (cinema_id) references cinemas (id)
);

create table if not exists seats
(
    id          int auto_increment primary key,
    type        varchar(255) not null,
    price       long         not null,
    seat_row    varchar(10)  not null,
    seat_number int          not null,
    room_id     int          not null
);

create table if not exists showtimes
(
    id         int auto_increment primary key,
    movie_id   int       not null,
    room_id    int       not null,
    date       date      not null,
    start_time timestamp not null,
    end_time   timestamp not null,
    foreign key (room_id) references rooms (id)
);

create table if not exists bookings
(
    id          int auto_increment primary key,
    showtime_id int          not null,
    account_id  int          not null,
    total_price long         not null,
    foreign key (showtime_id) references showtimes (id),
    status      varchar(255) not null
);

create table if not exists booked_seats
(
    id         int auto_increment primary key,
    seat_id    int not null,
    booking_id int not null,
    foreign key (seat_id) references seats (id),
    foreign key (booking_id) references bookings (id)
);