create table if not exists roles
(
    id   int auto_increment primary key,
    name varchar(10) null
);

create table if not exists accounts
(
    id       int auto_increment primary key,
    username varchar(255) not null,
    password varchar(255) not null,
    email    varchar(255) not null,
    role_id  int          null,
    foreign key (role_id) references roles (id)
);
create table if not exists access_tokens
(
    id         int auto_increment primary key,
    token      varchar(255)         not null,
    account_id int                  not null,
    token_type varchar(255)         not null,
    expires_in timestamp            not null,
    is_revoked tinyint(1) default 0 not null,
    foreign key (account_id) references accounts (id)
);
-- Create indexes
CREATE INDEX idx_accounts_username ON accounts (username);
CREATE INDEX idx_accounts_email ON accounts (email);
CREATE INDEX idx_access_tokens_token ON access_tokens (token);
