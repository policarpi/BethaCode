-- Database: cursoBetha
-- EXERCÍCIOS 26/06/2021

-- 1 – Selecionar apenas a descricao e valor dos  eventos. 

SELECT DESCRICAO,
	VALOR_EVENTO
		FROM EVENTOS

-- 2 – Selecionar o nome, e-mail e salários dos  Funcionários, mas demonstrar como nmNome, nmEmail e vlrSalario. 

SELECT DISTINCT funcionarios.nome AS nmNome, funcionarios.email AS nmEmail, calculos.valor_bruto AS vlrSalario
	FROM funcionarios INNER JOIN calculos
		ON (funcionarios.i_funcionarios = calculos.i_funcionarios)

-- 3 – Selecionar apenas os funcionários com salário superior a R$: 1000,00.
-- Alteri para R$ 5000,00 para poder terstar a clusula...

SELECT DISTINCT funcionarios.nome AS Nome, funcionarios.email AS Email, calculos.valor_bruto AS Salario
	FROM funcionarios INNER JOIN calculos
		ON (funcionarios.i_funcionarios = calculos.i_funcionarios)
			WHERE funcionarios.i_funcionarios = calculos.i_funcionarios AND  calculos.valor_bruto > 5000 
			

-- 4 – Selecionar os diferentes valores de salário Na tabela de cargos. 

SELECT DISTINCT salario AS Salário, descricao AS Descrição
	FROM cargos

-- 5 – Selecionar os funcionários ordenando  por nome e cpf de forma decrescente. 

SELECT nome, cpf 
	FROM funcionarios
		ORDER BY nome,cpf desc

-- 6 – Selecionar os eventos de tipo Aumento e com valor superior a R$: 100,00.

SELECT descricao, tipo, valor_evento AS Evento_Superior_A_100 FROM eventos
	WHERE valor_evento > 100

-- 7 – Selecionar os cargos com código entre 10 e 100. 

SELECT descricao AS Descrição, salario AS Salario, i_cargos AS ID_Entre_10_100
	FROM cargos
		WHERE i_cargos BETWEEN 10 AND 100


-- 8 – Selecionar o nome dos funcionário em letras  maiúsculas.

SELECT UPPER(nome) AS nomeMaiusculo
		FROM funcionarios

-- 9 – Selecionar os funcionários que começam com a letra T e terminam com a letro O. 

SELECT *
	FROM funcionarios
		WHERE UPPER(nome) LIKE 'T%O'

-- 10 – Atualizar os salários dos cargos em R$: 100,00, quando o salário do cargo for inferior há R$:1500,00. 

UPDATE cargos
	SET salario = salario + 100
    	WHERE salario < 1500

-- 11 – Faça um computado com o tipo do evento, demostrando Aumento ou Desconto. 

SELECT descricao as Descrição, tipo, valor_evento,  
	CASE WHEN tipo = 'A' THEN 'Aumento'
		ELSE 'desconto' END
			FROM eventos

-- 12 – Demonstre no mesmo SQL, o nome e CPF do  Funcionário e a descrição do seu cargo.

SELECT DISTINCT funcionarios.nome AS Nome, funcionarios.cpf AS CPF , cargos.descricao AS Descrição_Cargo
	FROM funcionarios INNER JOIN cargos
		ON (funcionarios.i_cargos = cargos.i_cargos)
		
-- 13 – Com o group by, demonstre a soma dos  salários calculados para cada competência. 

SELECT mes_competencia AS Comperencia, count (*) AS Ocorrencias,
	SUM (valor_bruto) AS somaDasAliquodtas
		FROM  calculos
			GROUP BY mes_competencia
				ORDER BY mes_competencia ASC

-- 14 – Com exists, selecione os funcionários com salário calculado em 2021. 

SELECT * FROM funcionarios
		WHERE EXISTS (SELECT 1 FROM calculos 
					  WHERE calculos.i_funcionarios = funcionarios.i_funcionarios 
					  AND ano_competencia = 2021)

-- 15 – Com in, selecione os funcionários com eventos Manuais lançados para Julho/2021 do tipo desconto.

SELECT DISTINCT nome FROM funcionarios, eventos
	WHERE i_funcionarios IN (SELECT i_funcionarios FROM eventos_manuais WHERE mes = 6 )
		AND eventos.tipo = 'D'