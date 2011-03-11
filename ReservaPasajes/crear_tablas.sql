drop table app.asientos;
drop table app.personas;
drop table app.lugares;
drop table app.clientes;
drop table app.itinerarios;
drop table app.servicios;
drop table app.vehiculos;
drop table app.iti_x_emp;
drop table app.tra_x_emp;
drop table app.empresas;
drop table app.reservas;
drop table app.asi_x_tra;
drop table app.transportes;



create table app.asientos(asi_numero_asiento integer,  asi_disponible char(1), asi_ubicacion char(50), primary key (asi_numero_asiento));
create table app.personas(per_id integer, per_denominacion char(50), per_email char(50), per_documento char(8), per_tipo_documento char(4), per_sexo char(1), primary key (per_id));
create table app.lugares(lug_id integer, lug_descripcion char(50), lug_localidad char(50), lug_provincia char(50), lug_pais char(50), primary key (lug_id));
create table app.clientes(cli_id integer, cli_tarjeta_credito char(50), cli_per_id integer, primary key (cli_id));
create table app.itinerarios( iti_id integer, iti_lug_origen integer, iti_lug_destino integer, iti_horario_salida char(5), iti_distancia_km numeric, primary key (iti_id));
create table app.servicios(ser_id integer, ser_origen char(50), ser_destino char(50), ser_empresa_prestadora char(50), ser_numero_asiento integer, ser_hora_salida char(5), ser_fecha_salida char(10), ser_descr_tipo_serv char(20), ser_precio decimal(10,2), primary key(ser_id) );
create table app.vehiculos(veh_id integer , veh_descripcion char(50), veh_tipo char(10), primary key (veh_id));
create table app.iti_x_emp(iti_id integer, emp_id integer);
create table app.tra_x_emp(tra_id integer, emp_id integer);
create table app.empresas(emp_id integer, emp_tipo_transporte char(20), emp_precio_por_km decimal(10,2), emp_per_id integer,  primary key (emp_id));
create table app.reservas(res_id integer, res_estado char(50), res_ser_id integer, res_cli_id integer, primary key (res_id) );
create table app.asi_x_tra(asi_id integer, tra_id integer);
create table app.transportes(tra_id integer, tra_veh_id integer, primary key (tra_id));

