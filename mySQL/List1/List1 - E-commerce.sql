create database db_e_commerce;

use db_e_commerce;

create table tb_produto(

id int auto_increment,
modelo varchar(20) not null,
preco decimal (10,2),
cor varchar(20) not null,
tam varchar (5) not null,
quantidade int, 
em_estoque boolean,
primary key (id)

);

insert into tb_produto (modelo, preco, cor, tam, quantidade, em_estoque) 
values ("Blusa", 99.99, "Preto", "M", 10, true);
insert into tb_produto (modelo, preco, cor, tam, quantidade, em_estoque) 
values ("Moletom", 129.99, "Preto", "M", 8, true);
insert into tb_produto (modelo, preco, cor, tam, quantidade, em_estoque) 
values ("Regata", 29.99, "Preto", "M", 7, true);
insert into tb_produto (modelo, preco, cor, tam, quantidade, em_estoque) 
values ("Camisa", 49.99, "Preto", "M", 6, true);
insert into tb_produto (modelo, preco, cor, tam, quantidade, em_estoque) 
values ("Shorts", 39.99, "Preto", "M", 9, true);
insert into tb_produto (modelo, preco, cor, tam, quantidade, em_estoque) 
values ("Jaqueta", 129.99, "Preto", "M", 10, true);
insert into tb_produto (modelo, preco, cor, tam, quantidade, em_estoque) 
values ("Cropped", 19.99, "Preto", "M", 1, true);
insert into tb_produto (modelo, preco, cor, tam, quantidade, em_estoque) 
values ("Jeans", 79.99, "Preto", "M", 4, true);

select * from tb_produto where preco > 29.99;
select * from tb_produto where preco < 19.99;

update tb_produto set quantidade = 0, em_estoque = false
where id = 7;