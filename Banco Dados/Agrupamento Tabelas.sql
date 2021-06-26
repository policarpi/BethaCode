-- update com WHERE
SELECT *
	FROM pessoas
		order by i_pessoas asc

UPDATE pessoas
	SET nome = 'Manuel da rosa'
			WHERE i_pessoas = 5


BEGIN
UPDATE pessoas
SET nome = 'Silva da silva'
WHERE i_pessoas =7;
UPDATE 
COMMIT
--  CASE


SELECT * FROM ATIVIDADES

UPDATE atividades 
SET calssificacao = 'I'
WHERE i_atividades


--  CASE

SELECT i_atividades,
		descricao,
		case WHEN classificacao = 'C' THEN 'Comércio'
			WHEN classificacao = 'I' THEN 'INDUSTRIA'
			ELSE 'Pestação de serviço' END AS descClassificacao
				FROM atividades

-- COALESCE para campos null trazer dados com informação definida

SELECT email,
	COALESCE (email, 'Email não informado') as emailDaPessoas
FROM pessoas

--UNION - COLUNAS IGUAIS DO MESMO TIPO
SELECT * FROM  pessoas
SELECT * FROM  empresas


SELECT nome AS listaDeNome, i_pessoas AS cdCodigo
	FROM pessoas
	UNION
SELECT nome, i_empresas
	FROM empresas

------------------------------------
------------------------------------
---- relacionamento de tabelas ----- 
------------------------------------
------------------------------------

SELECT  pessoas.i_pessoas,
		pessoas.nome,
		enderecos_pessoas.i_pessoas,
		enderecos_pessoas.bairro
		FROM pessoas,enderecos_pessoas
			WHERE pessoas.i_pessoas = enderecos_pessoas.i_pessoas
			
SELECT *
	FROM pessoas INNER JOIN enderecos_pessoas
		ON (pessoas.i_pessoas = enderecos_pessoas.i_pessoas)


-- LEFT OUTER JOIN
SELECT *
	FROM pessoas LEFT OUTER JOIN enderecos_pessoas
		ON (pessoas.i_pessoas = enderecos_pessoas.i_pessoas)
		

SELECT pessoas.i_pessoas, pessoas.nome, enderecos_pessoas.bairro
	FROM pessoas LEFT OUTER JOIN enderecos_pessoas
		ON (pessoas.i_pessoas = enderecos_pessoas.i_pessoas)
		
------------------------------------
------------------------------------
---- AGRUPAMENTO de tabelas ----- 
------------------------------------
------------------------------------

SELECT bairro 
	FROM enderecos_pessoas
		GROUP BY bairro

-- COUNT SUM AVG MAX MIN
-- COUNT
SELECT bairro, rua,  COUNT (*) AS quantidadeOcorrencia
	FROM enderecos_pessoas
		GROUP BY bairro, rua

--  mim max
SELECT bairro, 
		rua,  
		COUNT (*) AS quantidadeOcorrencia,
		MIN (i_pessoas) AS menoOcorrrencia,
		MAX (i_pessoas) AS maiorOcorrrencia
	FROM enderecos_pessoas
		GROUP BY bairro, rua

-- SUM

SELECT tipo, count (*) AS quantidadeDeOcorrencia,
	SUM (aliquota) AS somaDasAliquodtas
	FROM  atividades
	GROUP BY tipo

-- AVG
SELECT tipo, count (*) AS quantidadeDeOcorrencia,
	SUM (aliquota) AS somaDasAliquotas,
	AVG (aliquota) AS mediaDasAliquotas 
	FROM  atividades
	GROUP BY tipo
	
--HAVING
-- PENAS PARA FILTRO DENTRO DE UMA GRUPAMENTO

SELECT tipo_pessoa, COUNT(*)
	FROM pessoas
		WHERE i_pessoas IN (2,3,5,7,9)
		GROUP BY tipo_pessoa
			HAVING COUNT (*) >2
			
--- SOB CONSULTA

SELECT 
	(SELECT descricao
	FROM atividades
	WHERE atividades.i_atividades = empresas.i_atividades) AS descAtv
		FROM empresas
		
-- exists
SELECT * 
	FROM pessoas
		WHERE EXISTS (SELECT 1 FROM enderecos_pessoas 
					  WHERE enderecos_pessoas.i_pessoas = pessoas.i_pessoas)
SELECT * 
	FROM pessoas
		WHERE NOT EXISTS (SELECT 1 FROM enderecos_pessoas 
					  WHERE enderecos_pessoas.i_pessoas = pessoas.i_pessoas)
					  
SELECT * 
	FROM pessoas
		WHERE  i_pessoas IN (SELECT i_pessoas FROM enderecos_pessoas)
	