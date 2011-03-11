insert into APP.asientos values( 1, 'S', 'PASILLO');
insert into APP.asientos values( 2, 'S', 'VENTANILLA');
insert into APP.asientos values( 3, 'S', 'VENTANILLA');
insert into APP.asientos values( 4, 'S', 'PASILLO');

insert into APP.clientes VALUES (1, '90930243289032',1);
insert into APP.clientes VALUES (2, '97830243289032',2);
insert into APP.clientes VALUES (3, '1454545646464',3);

insert into APP.personas VALUES (1, 'HOMERO SIMPSON', 'hsimpson@dominio.com','20000001','DNI','M');
insert into APP.personas VALUES (2, 'MARGE SIMPSON', 'msimpson@dominio.com','20000002','DNI','M');
insert into APP.personas VALUES (3, 'SARMIENTO', 'sarmiento@dominio.com','20000003','DNI','M');


insert into APP.empresas VALUES (1, 'X OMNIBUS',50,3);
insert into APP.empresas VALUES (2, 'X MINIBUS',60,3);


insert into APP.itinerarios VALUES ( 1, 4,1,'10:20',30);
insert into APP.itinerarios VALUES ( 2, 4,2,'11:10',36);
insert into APP.itinerarios VALUES ( 3, 4,3,'11:10',100);

insert into APP.iti_x_emp VALUES (1, 3 );
insert into APP.iti_x_emp VALUES (2, 3 );

insert into APP.lugares VALUES (1, 'ALTA GRACIA','CORDOBA','CORDOBA','ARGENTINA');
insert into APP.lugares VALUES (2, 'CARLOS PAZ','CORDOBA','CORDOBA','ARGENTINA');
insert into APP.lugares VALUES (3, 'SAN FRANCISCO','SAN FRANCISCO','CORDOBA','ARGENTINA');
insert into APP.lugares VALUES (4, 'CORDOBA','CORDOBA','CORDOBA','ARGENTINA');

insert into APP.servicios VALUES ( 1, 'CORDOBA','ALTA GRACIA', 'SARMIENTO',1,'10:20','10/11/2010','DIRECTO', 50);
insert into APP.servicios VALUES ( 2, 'CORDOBA','ALTA GRACIA', 'SARMIENTO',2,'10:20','10/11/2010','DIRECTO', 50);
insert into APP.servicios VALUES ( 3, 'CORDOBA','ALTA GRACIA', 'SARMIENTO',3,'10:20','10/11/2010','DIRECTO', 50);

insert into APP.vehiculos VALUES (1, 'COLECTIVO SEMI CAMA MERCEDES','COLECTIVO');
insert into APP.vehiculos VALUES (2, 'COLECTIVO CAMA MERCEDES','COLECTIVO');
insert into APP.vehiculos VALUES (3, 'MINI BUS MERCEDES','MINI BUS');

insert into APP.transportes VALUES (1,1);
insert into APP.transportes VALUES (2,2);


insert into APP.tra_x_emp VALUES (1,1 );
insert into APP.tra_x_emp VALUES (2,1 );

insert into APP.asi_x_tra VALUES (1,1);
insert into APP.asi_x_tra VALUES (2,1);
insert into APP.asi_x_tra VALUES (3,1);