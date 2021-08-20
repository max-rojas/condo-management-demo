insert into representante_de_condominio (id, nombre, apellido, telefono, correo)
values (20001, 'Max', 'Rojas', '86110962', 'maxter.rojas@gmail.com');



insert into condominio (id, representatne_del_condominio_id, provincia, canton, distrito, barrio, linea1, nombre_de_condominio,
                        cedula_juridica_de_asociacion, cantidad_de_unidades, monto_de_cuota_condominal, estado)
values (10001, 20001, 'Heredia', 'Heredia', 'Ulloa', 'Lagunilla', 'casa #14B', 'Condominio Las Flores', '3-2036-3214', 64, 50000, 'ACTIVO');


insert into condomino_de_condominio (id, nombre, apellido, telefono, correo, condominio_id, numero_de_residencia,
                                     estado_de_condomino_de_condominio)
values (30001, 'Juan', 'Perez', '85239658', 'juan.perez@gmail.com', 10001, '28D', 'CONDOMINO');


insert into cuota_condominal (id, condomino_de_condominio_id, monto_de_cuota, fecha_de_cuota, condominio_id)
values (40001, 30001, 50000, sysdate(), 10001);

insert into amenidad (id, nombre, descripcion)
values (50001, 'piscina', 'piscina olympica');

insert into condominio_amenidad (condominio_id, amenidad_id)
values (10001, 50001)