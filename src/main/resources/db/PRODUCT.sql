DROP TABLE IF EXISTS product;
CREATE TABLE IF NOT EXISTS product(
   ID    INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY 
  ,NAME  VARCHAR(17) NOT NULL
  ,PRICE NUMERIC(4,1) NOT NULL
);
INSERT INTO product(ID,NAME,PRICE) VALUES (0,'Iron Iron',5.4);
INSERT INTO product(ID,NAME,PRICE) VALUES (1,'Chair Shoe',24.8);
INSERT INTO product(ID,NAME,PRICE) VALUES (2,'Telephone Clock',24.8);
INSERT INTO product(ID,NAME,PRICE) VALUES (3,'Chair Chair',25.4);
INSERT INTO product(ID,NAME,PRICE) VALUES (4,'Ice Tea Shoe',12.8);
INSERT INTO product(ID,NAME,PRICE) VALUES (5,'Clock Clock',23.6);
INSERT INTO product(ID,NAME,PRICE) VALUES (6,'Ice Tea Chair',9.8);
INSERT INTO product(ID,NAME,PRICE) VALUES (7,'Telephone Shoe',8.4);
INSERT INTO product(ID,NAME,PRICE) VALUES (8,'Ice Tea Clock',22.6);
INSERT INTO product(ID,NAME,PRICE) VALUES (9,'Clock Telephone',17.2);
INSERT INTO product(ID,NAME,PRICE) VALUES (10,'Telephone Ice Tea',20.4);
INSERT INTO product(ID,NAME,PRICE) VALUES (11,'Telephone Iron',8.8);
INSERT INTO product(ID,NAME,PRICE) VALUES (12,'Clock Ice Tea',16.8);
INSERT INTO product(ID,NAME,PRICE) VALUES (13,'Telephone Clock',18.0);
INSERT INTO product(ID,NAME,PRICE) VALUES (14,'Telephone Iron',12.4);
INSERT INTO product(ID,NAME,PRICE) VALUES (15,'Ice Tea Chair',9.4);
INSERT INTO product(ID,NAME,PRICE) VALUES (16,'Ice Tea Shoe',19.4);
INSERT INTO product(ID,NAME,PRICE) VALUES (17,'Clock Ice Tea',22.0);
INSERT INTO product(ID,NAME,PRICE) VALUES (18,'Chair Clock',17.2);
INSERT INTO product(ID,NAME,PRICE) VALUES (19,'Ice Tea Ice Tea',11.0);
INSERT INTO product(ID,NAME,PRICE) VALUES (20,'Ice Tea Telephone',20.0);
INSERT INTO product(ID,NAME,PRICE) VALUES (21,'Chair Chair',11.4);
INSERT INTO product(ID,NAME,PRICE) VALUES (22,'Iron Iron',6.6);
INSERT INTO product(ID,NAME,PRICE) VALUES (23,'Shoe Chair',7.6);
INSERT INTO product(ID,NAME,PRICE) VALUES (24,'Chair Shoe',7.2);
INSERT INTO product(ID,NAME,PRICE) VALUES (25,'Shoe Shoe',16.2);
INSERT INTO product(ID,NAME,PRICE) VALUES (26,'Shoe Shoe',25.2);
INSERT INTO product(ID,NAME,PRICE) VALUES (27,'Telephone Iron',23.0);
INSERT INTO product(ID,NAME,PRICE) VALUES (28,'Clock Iron',3.0);
INSERT INTO product(ID,NAME,PRICE) VALUES (29,'Chair Telephone',11.2);
INSERT INTO product(ID,NAME,PRICE) VALUES (30,'Shoe Iron',23.2);
INSERT INTO product(ID,NAME,PRICE) VALUES (31,'Ice Tea Telephone',4.8);
INSERT INTO product(ID,NAME,PRICE) VALUES (32,'Clock Iron',19.0);
INSERT INTO product(ID,NAME,PRICE) VALUES (33,'Iron Chair',18.2);
INSERT INTO product(ID,NAME,PRICE) VALUES (34,'Chair Iron',25.6);
INSERT INTO product(ID,NAME,PRICE) VALUES (35,'Telephone Shoe',7.6);
INSERT INTO product(ID,NAME,PRICE) VALUES (36,'Ice Tea Iron',3.2);
INSERT INTO product(ID,NAME,PRICE) VALUES (37,'Clock Shoe',9.4);
INSERT INTO product(ID,NAME,PRICE) VALUES (38,'Clock Ice Tea',21.6);
INSERT INTO product(ID,NAME,PRICE) VALUES (39,'Ice Tea Shoe',15.4);
INSERT INTO product(ID,NAME,PRICE) VALUES (40,'Shoe Clock',2.8);
INSERT INTO product(ID,NAME,PRICE) VALUES (41,'Clock Ice Tea',20.6);
INSERT INTO product(ID,NAME,PRICE) VALUES (42,'Iron Chair',19.8);
INSERT INTO product(ID,NAME,PRICE) VALUES (43,'Telephone Clock',9.4);
INSERT INTO product(ID,NAME,PRICE) VALUES (44,'Ice Tea Ice Tea',9.6);
INSERT INTO product(ID,NAME,PRICE) VALUES (45,'Iron Ice Tea',18.0);
INSERT INTO product(ID,NAME,PRICE) VALUES (46,'Ice Tea Clock',6.2);
INSERT INTO product(ID,NAME,PRICE) VALUES (47,'Ice Tea Iron',17.8);
INSERT INTO product(ID,NAME,PRICE) VALUES (48,'Clock Clock',21.0);
INSERT INTO product(ID,NAME,PRICE) VALUES (49,'Iron Iron',2.2);