-------------------------
----Popula Eventos-------
-------------------------
INSERT INTO eventos
SELECT *
FROM JSON_POPULATE_RECORDSET (NULL::eventos,
'[{ "i_eventos": "1",
	"descricao": "Participa resultado",
	"tipo":"A",
	"valor_evento": 100 }, { "i_eventos": "2",
	"descricao": "Participa Lucro",
	"tipo":"A",
	"valor_evento": 234 }, { "i_eventos": "3",
	"descricao": "Dicidio",
	"tipo":"A",
	"valor_evento": 340 }, { "i_eventos": "4",
	"descricao": "Vale alimentacao",
	"tipo":"A",
	"valor_evento": 600 }, { "i_eventos": "5",
	"descricao": "Vale refeição",
	"tipo":"D",
	"valor_evento": 550 }, { "i_eventos": "6",
	"descricao": "Ajuda de custo",
	"tipo":"D",
	"valor_evento": 500 }, { "i_eventos": "7",
	"descricao": "Previdencai privada",
	"tipo":"D",
	"valor_evento": 350 }
]');