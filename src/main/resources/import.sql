INSERT INTO ACCOUNT_GRANTED_AUTHORITY (ID, AUTHORITY) VALUES(1, 'ADMIN');

INSERT INTO ACCOUNT (ID, NICKNAME, ENABLED, EMAIL, PASSWORD) VALUES(1, 'jshuser', true, 'user@jsh.gob.mx', 'testpasswd');

INSERT INTO ACCOUNT_GRANTED_AUTHORITIES (ACCOUNT, AUTHORITY) VALUES(1,1);

insert into ClasificacionProducto values (1, 'Carbohidratos', 15);
insert into ClasificacionProducto values (2, 'Lípidos', 14);
insert into ClasificacionProducto values (3, 'Proteínas', 23);
insert into ClasificacionProducto values (4, 'Vitaminas', 133);
insert into ClasificacionProducto values (5, 'Minerales', 244);
insert into ClasificacionProducto values (6, 'Agua', 0);

insert into Producto values (1, 'Agua embotellada', '0', 6);
insert into Producto values (2, 'Donas', 1', 1);

insert into Embalaje values (1, 'Bandeja');
insert into Embalaje values (2, 'Caja dispensadore de líquidos');
insert into Embalaje values (3, 'Caja envolvente o Wrap around');
insert into Embalaje values (4, 'Caja expositora');
insert into Embalaje values (5, 'Caja de fondo automático');
insert into Embalaje values (6, 'Caja de fondo semiautomático');
insert into Embalaje values (7, 'Caja de madera');
insert into Embalaje values (8, 'Caja de plástico');
insert into Embalaje values (9, 'Caja con rejilla incorporada');
insert into Embalaje values (10, 'Caja con tapa');
insert into Embalaje values (11, 'Caja de tapa y fondo');
insert into Embalaje values (12, 'Caja de solapas');
insert into Embalaje values (13, 'Cartón ondulado');
insert into Embalaje values (14, 'Cesta');
insert into Embalaje values (15, 'Estuche');
insert into Embalaje values (16, 'Film plástico');
insert into Embalaje values (17, 'Plástico de burbujas');
insert into Embalaje values (18, 'Plató agrícola');
insert into Embalaje values (19, 'Saco de papel');

insert into TransportesCajas values (1, 'Caja de solapas');
insert into TransportesCajas values (2, 'Caja troquelada automontable');
insert into TransportesCajas values (3, 'Troquel');

insert into TransportesUnidades values (1, 'Tráiler');
insert into TransportesUnidades values (2, 'Van');

insert into Donador (IDDonador, razonSocial, reciboFiscal, RFC, folioAcuseConvenio, vigenciaConvenio, comentarios, calificacion, fechaRegistro, habilitado) values (1, 'NUEVA WAL MART DE MEXICO S DE RL DE C V.', 0, 'NWM-970924-4W4', 'FolioAcuse', current_date, 'SIN COMENTARIOS', '6', current_date, 1);

insert into Donativo values (1, 'RemisionBA', '2018-03-20 00:00:00', '2018-03-22 00:00:00', 'RequerimientosDonador', 'CondicionesTransporte', 'CoordinacionTransporte', 1024, 'DR', 'Especificaciones', 1, 1, 1);

insert into DetalleDonativo values (1, 14, 32, now(), 1, 700, 14, 1, '2018-03-20 00:00:00', '2018-03-22 00:00:00', '2018-03-22 00:00:00', '14 cajas', '2 cajas', 'costo op', 'comentarios', '4', 1, 1, 1);

insert into EntradaAlmacen values (1, 1, 5, 4, 'SeccionAlmacenamiento', '2018-03-22 00:00:00', 1, 1, 1);
