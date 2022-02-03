CREATE TABLE FREIGHT_ORDER
(
   ID INT NOT NULL AUTO_INCREMENT,
   weight FLOAT,
   zipCodeSource VARCHAR (9),
   zipCodeTarget VARCHAR (9),
   recipientName VARCHAR (25),
   totalValueFreight FLOAT,
   foreseeableDeliveryDate DATE,
   orderDate DATE,
   PRIMARY KEY (ID)
);