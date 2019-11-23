INSERT INTO  [DB_CPRF].[dbo].[USUARIOS] (StatusUsuario,
    DataCadastro,
	NomeUsuario,
	LoginUsuario,
	SenhaUsuario,
	ConfirmaSenhaUsuario,
	NomeDepartamento,
	NomeCargo
)SELECT 
    StatusUsuario,
    DataCadastro,
	NomeUsuario,
	LoginUsuario,
	SenhaUsuario,
	ConfirmaSenhaUsuario,
	NomeDepartamento,
	NomeCargo
	FROM [DB_SOCIALIZA_CPMS].[dbo].[USUARIOS]