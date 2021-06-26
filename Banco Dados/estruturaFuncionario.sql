
CREATE TABLE cargos (	
	i_cargos	SERIAL,
	descricao	VARCHAR(60)	NOT NULL,
	salario		REAL NOT NULL,
	PRIMARY KEY(i_cargos)
);

CREATE TABLE funcionarios(
	i_funcionarios 			SERIAL,
	nome					VARCHAR(60),
	telefone				VARCHAR(14),
	email					VARCHAR(100),
	endereco				VARCHAR(100),
	cpf						VARCHAR(14)	NOT NULL UNIQUE,
	carteira_trabalho		VARCHAR(14),
	dt_admissao				DATE,
	dt_demissao				DATE,
	dt_nascimento			DATE,
	i_cargos				INTEGER	REFERENCES cargos(i_cargos),
	PRIMARY KEY(i_funcionarios)
);

CREATE TABLE eventos (
	i_eventos		SERIAL,
	descricao		VARCHAR(60),
	tipo			VARCHAR (1) NOT NULL CHECK(tipo in ('A','D')),
	valor_evento	REAL,
	PRIMARY KEY(i_eventos)
);

CREATE TABLE eventos_manuais (
	i_eventos_manuais		SERIAL,
	anos					INTEGER,
	mes						INTEGER,
	i_funcionarios			INTEGER	REFERENCES funcionarios(i_funcionarios),
	i_eventos				INTEGER	REFERENCES eventos(i_eventos),
	valor_evento			REAL,
	PRIMARY KEY(i_eventos_manuais)
);

CREATE TABLE calculos(
	i_calculos			SERIAL,
	mes_competencia		INTEGER,
	ano_competencia		INTEGER,
	i_funcionarios		INTEGER	REFERENCES funcionarios(i_funcionarios),
	valor_bruto			REAL,
	valor_liquido		REAL,
	PRIMARY KEY (i_calculos)
);

CREATE TABLE calculos_composicao(
	i_calculos_composicao   INTEGER,
	i_calculos				INTEGER	REFERENCES calculos(i_calculos),
	i_eventos_manuais		INTEGER	REFERENCES eventos_manuais(i_eventos_manuais),
	valor_calculado			REAL,
	PRIMARY KEY (i_calculos_composicao)
);
	
