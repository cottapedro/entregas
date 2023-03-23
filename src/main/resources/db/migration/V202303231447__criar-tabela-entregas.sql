create table entregas.ENTREGA(
	id bigint not null auto_increment,
    cliente_id bigint not null,
	taxa decimal(5,2) not null,
    dataPedido dateTime not null,
    dataFinalizacao dateTime,
    status varchar(20) not null,

    destinatario_nome varchar(60) not null,
    destinatario_logradouro varchar(20) not null,
    destinario_numero varchar(10) not null,
    destinatario_bairro varchar(30) not null,
    destinatario_complemento varchar(30),

    primary key(id)
);

alter table entregas.ENTREGA add constraint fk_entrega_cliente
foreign key(cliente_id) references entregas.CLIENTE (id);