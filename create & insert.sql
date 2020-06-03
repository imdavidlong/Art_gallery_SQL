
USE art_gallery;

create table customer
( cid varchar(20) PRIMARY KEY,
phone varchar(20),
pword varchar(20),
first_name varchar(20),
last_name varchar(20)
);

create table galleryOffice (
office_name varchar(40) PRIMARY KEY, 
phone varchar(20),
address varchar(50)
);
create table saleArtwork
( aid char(20) PRIMARY KEY,
art_name varchar(20), 
art_type varchar(20), 
price int,
a_status varchar(20),
cid varchar(20),
foreign key(cid) references customer(cid) on delete cascade
);
create table artist
( artist_id varchar(20) PRIMARY KEY,
first_name varchar(20),
last_name varchar(20) );

create table artGallery
( gallery_name varchar(50),
address varchar(50) PRIMARY KEY, 
phone varchar(50)
);

create table artwork_name ( 
artist_id char(20),
a_name varchar(20),
a_type varchar(20),
​created_date​ DATE, 
PRIMARY KEY (a_name, a_type),
FOREIGN KEY (artist_id) REFERENCES artist (artist_id) ON DELETE NO ACTION
 );
 create table located_exhibition_room(
room_num int,
address varchar(50),
room_size varchar(20),
roomtype varchar(20),
PRIMARY KEY(room_num,address), 
FOREIGN KEY(address) references artGallery(address) ON DELETE no action
);
 create table exhibition_room ( address char(50),
room_number int,
a_type varchar(20),
PRIMARY KEY (address, room_number),
FOREIGN KEY (room_number,address) REFERENCES located_exhibition_room(room_num,address)
ON DELETE CASCADE
);
create table artwork_exhibition_room ( 
aid varchar(20) PRIMARY KEY,
a_name varchar(20),
address varchar(50),
room_number int,
FOREIGN KEY (room_number, address) REFERENCES located_exhibition_room(room_num,address)
ON DELETE CASCADE ON UPDATE CASCADE
);


create table manage_event_locate( 
event_name varchar(50) PRIMARY KEY, 
office_name varchar(40) not null, 
start_date DATE,
end_date DATE,
address varchar(50) not null,
FOREIGN KEY(office_name) references galleryOffice(office_name) ON DELETE cascade,
FOREIGN KEY(address) references artGallery(address)
ON DELETE cascade
);
Create table buytic
(Event_name varchar(50) PRIMARY KEY,
Show_time date,
price int,
foreign key(Event_name) references manage_event_locate(event_name) on delete cascade
);
Create table buy_ticket_name
(confirm_number varchar(20) PRIMARY KEY,
cid varchar(20),
Event_name varchar(50),
office_name varchar(40),
foreign key(Event_name) references manage_event_locate(event_name) on delete cascade,
FOREIGN KEY(office_name) REFERENCES galleryOffice(office_name) ON DELETE cascade,
FOREIGN KEY(cid) References customer(cid) On DELETE cascade );






insert into customer values
( '000000001', '7782239893','123456','WEIXI','Long' ); 
insert into customer values
( '000000002', '7788699682','123456', 'Yujun', 'Chen' ); 
insert into customer values
( '000000003', '6868754322','123456', 'Harry', 'Potter' ); 
insert into customer values
( '000000004', '7322356789','123456', 'Tony', 'Liang' ); 
insert into customer values 
('000000005', '5432138899','123456','James', 'Charles');



insert into galleryOffice values
    ('Breathing Studios','1234567899','4343 sunshine st');

    insert into galleryOffice values
    ('Painting for the Future','1234567898','5258 sunset st');

    insert into galleryOffice values
    ('The Informed Artist','1234567897','3232 swiss mall');

    insert into galleryOffice values
    ('Studio Magic','1234567896','7878 west mall');

    insert into galleryOffice values
    ('Five Senses Art','1234567895','3456 east st');



insert into  saleArtwork values
    ('0000001','Black Square','Abstract','10000','Sold','000000001');
insert into  saleArtwork values
    ('0000002','Fountain','Conceptual','60000','On Sell',null);
insert into  saleArtwork values
    ('0000003','SISTINE MADONNA','Religious','34000','On Sell',null);
insert into  saleArtwork values
    ('0000004','The Swing','Rococo','10000','On Sell',null);
insert into  saleArtwork values
    ('0000005','The CIRS','Rococo','5000','On Sell',null);
insert into  saleArtwork values
    ('0000006','Whaam!','Pop','1220000','Sold','000000004');



  insert into  artist values
   ('0101','Kazimir','Malevich'); 
    insert into  artist values
   ('0102','MARCEL','DUCHAMP');
   insert into  artist values
   ('0103','Raffaello','Sanzio');
   insert into  artist values
   ('0104','Jean','Honoré');
   insert into  artist values
   ('0105','Roy','Lichtenstein');

        insert into  artGallery values
    ('Morris and Helen Belkin Art Gallery','1825 Main Mall, Vancouver, BC V6T 1Z2','6048222759');  
     insert into  artGallery values
    ('Vancouver Art Gallery','750 Hornby St, Vancouver, BC V6Z 2H7','6046624700');
    insert into  artGallery values
    ('Contemporary Art Gallery','555 Nelson St, Vancouver, BC V6B 6R5 ','6046812700');
    insert into  artGallery values
    ('Ian Tan Art Gallery','2342 Granville St, Vancouver, BC V6H 3G3','6047381077');
    insert into  artGallery values
    ('Chali-Rosso Art Gallery','549 Howe St, Vancouver, BC V6C 2C2 ','6047333594'); 






    



insert into artwork_name values
( '0101', 'Black Square', 'Abstract', '1915-01-03');
insert into artwork_name values
( '0102', 'Fountain', 'Conceptual', '1917-09-05');
insert into artwork_name values
( '0103', 'SISTINE MADONNA', 'Religious', '1512-02-17');
insert into artwork_name values
( '0104', 'The Swing', 'Rococo', '1767-06-22');
insert into artwork_name values
( '0105', 'Whaam!', 'Pop', '1963-12-30');

insert into located_exhibition_room values
 ('001','1825 Main Mall, Vancouver, BC V6T 1Z2','small','Abstract');
 insert into located_exhibition_room values
 ('002','750 Hornby St, Vancouver, BC V6Z 2H7','samll','Conceptual');
 insert into located_exhibition_room values
 ('003','555 Nelson St, Vancouver, BC V6B 6R5 ','middle','Religious');
 insert into located_exhibition_room values
 ('004','2342 Granville St, Vancouver, BC V6H 3G3','small','Rococo');
 insert into located_exhibition_room values
 ('005','549 Howe St, Vancouver, BC V6C 2C2 ','large','Pop');

insert into exhibition_room values
( '1825 Main Mall, Vancouver, BC V6T 1Z2', 1, 'Abstract');
insert into exhibition_room values
( '750 Hornby St, Vancouver, BC V6Z 2H7', 2,'Conceptual');
insert into exhibition_room values
( '555 Nelson St, Vancouver, BC V6B 6R5', 3,'Religious');
insert into exhibition_room values
( '2342 Granville St, Vancouver, BC V6H 3G3', 4,'Rococo');
insert into exhibition_room values
( '549 Howe St, Vancouver, BC V6C 2C2', 5,'Pop');



insert into artwork_exhibition_room values
( '00001', 'Black Square', '1825 Main Mall, Vancouver, BC V6T 1Z2', 1);
insert into artwork_exhibition_room values
( '00002', 'Fountain', '750 Hornby St, Vancouver, BC V6Z 2H7', 2);
insert into artwork_exhibition_room values
( '00003', 'SISTINE MADONNA', '555 Nelson St, Vancouver, BC V6B 6R5 ', 3);
insert into artwork_exhibition_room values
( '00004', 'The Swing', '2342 Granville St, Vancouver, BC V6H 3G3', 4);
insert into artwork_exhibition_room values
( '00005', 'Whaam!', '549 Howe St, Vancouver, BC V6C 2C2 ', 5);



 insert into manage_event_locate values
 ('SAMSKARA - Immersive Art Experience','Breathing Studios','2019-04-01','2019-08-30','1825 Main Mall, Vancouver, BC V6T 1Z2');
 insert into manage_event_locate values
 ('Fresh Paint','Painting for the Future','2019-04-01','2019-08-30','750 Hornby St, Vancouver, BC V6Z 2H7');
 insert into manage_event_locate values
 ('Spring 2019 Wine and Art Walk','The Informed Artist','2019-04-01','2019-08-30','555 Nelson St, Vancouver, BC V6B 6R5 ');
 insert into manage_event_locate values
 ('Schack-toberfest','Studio Magic','2019-04-01','2019-08-30','2342 Granville St, Vancouver, BC V6H 3G3');
 insert into manage_event_locate values
 ('FUSE: GESTURES','The Informed Artist','2019-04-01','2019-08-30','549 Howe St, Vancouver, BC V6C 2C2 ');
 insert into buytic values
    ('SAMSKARA - Immersive Art Experience','2019-05-04',20);
 insert into buytic values
    ('Fresh Paint','2019-05-05',10);
 insert into buytic values
    ('Spring 2019 Wine and Art Walk','2019-05-06',15);
 insert into buytic values
    ('Schack-toberfest','2019-05-07',14);
 insert into buytic values
    ('FUSE: GESTURES','2019-05-08',15);

 insert into buy_ticket_name values
    ('11000001','000000001','SAMSKARA - Immersive Art Experience', 'Breathing Studios');
 insert into buy_ticket_name values
    ('11000002','000000002','Fresh Paint', 'Painting for the Future');
 insert into buy_ticket_name values
    ('11000003','000000003','Spring 2019 Wine and Art Walk', 'The Informed Artist');
 insert into buy_ticket_name values
    ('11000004','000000004','Schack-toberfest', 'Studio Magic');
 insert into buy_ticket_name values
    ('11000005','000000005','FUSE: GESTURES', 'The Informed Artist'); 
 insert into buy_ticket_name values
    ('11000006','000000005','Fresh Paint', 'The Informed Artist');
     insert into buy_ticket_name values
    ('11000007','000000005','Spring 2019 Wine and Art Walk', 'The Informed Artist');
    insert into buy_ticket_name values
    ('11000008','000000002','SAMSKARA - Immersive Art Experience', 'Breathing Studios');
 insert into buy_ticket_name values
    ('11000010','000000002','Spring 2019 Wine and Art Walk', 'The Informed Artist');
 insert into buy_ticket_name values
    ('11000011','000000002','Schack-toberfest', 'Studio Magic');
 insert into buy_ticket_name values
    ('11000012','000000002','FUSE: GESTURES', 'The Informed Artist'); 
 insert into buy_ticket_name values
    ('11000013','000000002','Fresh Paint', 'The Informed Artist');
 insert into buy_ticket_name values
    ('11000014','000000002','Spring 2019 Wine and Art Walk', 'The Informed Artist');













 

