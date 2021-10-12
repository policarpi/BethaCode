CREATE TABLE curso
(

    Integer i_curso;
    String descricao;
    Integer num_creditos;
    String coordenador;
    CONSTRAINT i_curso PRIMARY KEY (i_curso)
)
CREATE TABLE disciplina
(
    id integer NOT NULL DEFAULT nextval('aluno_id_seq'::regclass),
    nome character varying(80) COLLATE pg_catalog."default" NOT NULL,
    idade integer NOT NULL,
    cidade character(30) COLLATE pg_catalog."default" NOT NULL,
    estado character(2) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT aluno_pkey PRIMARY KEY (id)
)