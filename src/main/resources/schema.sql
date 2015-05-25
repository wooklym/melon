create table if not exists user (
	id int primary key auto_increment,
	email varchar(255),
	pw varchar(255),
	created_at timestamp default current_timestamp,
	updated_at timestamp default current_timestamp
);
--
--create table if not exists artist (
--	pk int primary key auto_increment,
--	name varchar(255),
--	created_at timestamp default current_timestamp,
--	updated_at timestamp default current_timestamp
--);
--
--create table if not exists album (
--	pk int primary key auto_increment,
--	artist_pk int,
--	genre_pk int,
--	name varchar(255),
--	created_at timestamp default current_timestamp,
--	updated_at timestamp default current_timestamp,
--	foreign key (artist_pk) references artist(pk),
--	foreign key (genre_pk) references genre(pk)
--);
--
--create table if not exists song (
--	pk int primary key auto_increment,
--	artist_pk int,
--	album_pk int,
--	genre_pk int,
--	name varchar(255),
--	created_at timestamp default current_timestamp,
--	updated_at timestamp default current_timestamp,
--	foreign key (artist_pk) references artist(pk),
--	foreign key (album_pk) references album(pk),
--	foreign key (genre_pk) references genre(pk)
--);


insert into user (email, pw, created_at, updated_at) values (1234, 1234, now(), now());