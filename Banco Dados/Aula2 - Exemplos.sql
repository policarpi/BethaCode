CREATE TABLE pessoas(
i_pessoas		SERIAL,
nome			VARCHAR(60)		NOT NULL,
tipo_pessoa		VARCHAR(1)	
	CHECK(tipo_pessoa IN ('F','J')) DEFAULT 'F',
cpf_cnpj		VARCHAR(14)		NOT NULL UNIQUE,
email			VARCHAR(100),
telefone		VARCHAR(14),
celular			VARCHAR(14),
PRIMARY KEY(i_pessoas)
);

SELECT * FROM pessoas;


INSERT INTO pessoas
(i_pessoas, nome, tipo_pessoa, cpf_cnpj, email)
values(3, 'Joao','J', '55', 'teste@tttt');

CREATE TABLE atividades(
i_atividades	SERIAL,
descricao		VARCHAR(60)		NOT NULL	UNIQUE,
tipo			VARCHAR(1)		
	NOT NULL	CHECK(tipo IN ('A','S')),
classificacao	VARCHAR(1)		
	NOT NULL	CHECK(classificacao in ('A','I','C','S')),
aliquota		DECIMAL(7,4)	
	NOT NULL	CHECK(aliquota > 0),
PRIMARY KEY(i_atividades)
);


SELECT * FROM atividades


INSERT INTO ATIVIDADES
(descricao, tipo, classificacao, aliquota)
VALUES('Comércio de Sapatos', 'A', 'C', 2);



CREATE TABLE empresas(
i_empresas		SERIAL,
nome			VARCHAR(100)	NOT NULL,
nome_fantasia	VARCHAR(100)	NOT NULL,
funcionarios	INTEGER			CHECK(funcionarios > 0),
i_atividades	INTEGER		REFERENCES atividades(i_atividades),
PRIMARY KEY(i_empresas)
)

SELECT * FROM empresas
SELECT * FROM atividades

INSERT INTO empresas
(nome, nome_fantasia, funcionarios, i_atividades)
values('Betha', 'Betha Sistemas', 580, 1)

CREATE TABLE enderecos_pessoas(
	i_pessoas		INTEGER REFERENCES pessoas(i_pessoas),
	tipo_endereco	VARCHAR(1)	
		CHECK(tipo_endereco in ('P','S','C')) DEFAULT 'P',
	bairro			VARCHAR(60),
	rua				VARCHAR(60),
	numero			VARCHAR(10),
	cidade			VARCHAR(60),
	uf				VARCHAR(2)	DEFAULT 'SC',
	PRIMARY KEY(i_pessoas, tipo_endereco));
	
SELECT * FROM enderecos_pessoas;	

INSERT INTO enderecos_pessoas
(i_pessoas, tipo_endereco, bairro, rua, numero, cidade, uf)
values(3, 'C', 'Centro', 'Qualquer', 'S/N', 'Criciuma', 'SC');

SELECT * FROM pessoas order by i_pessoas asc;