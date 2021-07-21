create database db_escola;

use db_escola;

create table tb_aluno(
id int auto_increment,
nome varchar(20) not null,
serie int not null,
nota decimal (10,2),
aprovado boolean,
primary key (id)
);

insert into tb_aluno (nome, serie, nota, aprovado) 
values ("Ana", 3, 2.0, false);
insert into tb_aluno (nome, serie, nota, aprovado) 
values ("Juliana", 3, 9.0, true);
insert into tb_aluno (nome, serie, nota, aprovado) 
values ("Marcia", 3, 8.5, true);
insert into tb_aluno (nome, serie, nota, aprovado) 
values ("Rebeca", 3, 3.5, false);
insert into tb_aluno (nome, serie, nota, aprovado) 
values ("Alfredo", 3, 6.5, true);
insert into tb_aluno (nome, serie, nota, aprovado) 
values ("Ronaldo", 3, 5.0, true);
insert into tb_aluno (nome, serie, nota, aprovado) 
values ("Bob", 3, 3.0, false);
insert into tb_aluno (nome, serie, nota, aprovado) 
values ("Jefferson", 3, 10.0, true);

select * from tb_aluno where nota > 6;
select * from tb_aluno where nota < 6;

update tb_aluno set nota = 6.0, aprovado = true
where id = 1;