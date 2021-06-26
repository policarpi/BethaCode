SELECT * FROM
	pessoas
		WHERE nome like '%Joao%'
			
		
SELECT DISTINCT nome
	FROM pessoas;

-- padrão ordem crescente
SELECT *
	FROM pessoas
		ORDER BY i_pessoas;

-- descrecente
SELECT *
	FROM pessoas
		ORDER BY i_pessoas DESC;
	
-- Ordenar varias colunas
SELECT *
	FROM pessoas
		ORDER BY nome ASC, email ASC;
	
-- Operadores logicos SQL
-- AND OR NOT
-- AND
SELECT * FROM pessoas
	WHERE tipo_pessoa = 'J'
		AND cpf_cnpj  IN ('452','55')
			AND email = 'teste@tttt'
		
-- OR
SELECT * FROM pessoas
	WHERE nome = 'Neemias'
		OR
			cpf_cnpj = '55'
	
-- NOT 
SELECT * FROM pessoas
	WHERE  NOT i_pessoas = 5

SELECT * FROM pessoas
	WHERE  NOT tipo_pessoa = 'F'
	
-- BETWEEN

SELECT * FROM pessoas
	ORDER BY i_pessoas
		WHERE i_pessoas BETWEEN 1 AND 5
		
SELECT descricao,
	tipoAtividade = if tipo = 'a' then 'Analitica' else 'Sintetica'
		from atividades

-- calc 
SELECT descricao,
		aliquota,
	 		(aliquota * 100) as percentual,
				(i_atividades + 100) as codAtividadeMais100
		from atividades

SELECT descricao
		from atividades
		
		
-- FUNÇÕES STRINGS || LENGTH()  LOWER UPPER TRIM SUBSTR REPLACE

SELECT i_pessoas || ' - ' ||  nome || ' - ' || cpf_cnpj
	FROM pessoas
		ORDER BY i_pessoas ASC
		
--LENGTH		
SELECT email, 
	LENGTH(email) as tamanhoDoEmail,
		nome,
			LENGTH(nome) as tamanhoDoNome
		FROM pessoas

-- LOWER UPPER
SELECT nome,
	LOWER(nome) as nomeMinusculo,
	UPPER(nome) as nomeMaiusculo
		from pessoas
-- TRIM

SELECT nome,
	TRIM(nome) as nomeSemEspacos,
		TRIM(' neemias policarpi') as retiraEspaco
			FROM pessoas
			
-- SUBSTR
SELECT email,
		SUBSTR(email, 1, 5) as inicioDoEmail,
		SUBSTR(email, 2, 4) as novoEmail
			FROM pessoas
			
-- REPLACE
SELECT nome,
	REPLACE (nome, 'J', 'P') as mudaNome
		FROM pessoas
		
-- LIKE
SELECT *
	FROM pessoas
		WHERE UPPER(nome) LIKE '%NE%'
	
SELECT *
	FROM pessoas
		WHERE UPPER(nome) LIKE 'TI%'
		
SELECT *
	FROM pessoas
		WHERE LOWER(nome) LIKE '%ro'
		
SELECT *
	FROM pessoas
		WHERE UPPER(nome) LIKE 'T_AGO'
