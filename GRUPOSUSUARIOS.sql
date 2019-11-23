INSERT INTO  [DB_CPRF].[dbo].[GRUPOUSUARIOS] (StatusGrupo,
    NomeGrupo
)SELECT 
    StatusGrupo,
	NomeGrupo
	FROM [DB_SOCIALIZA_CPMS].[dbo].[GRUPOUSUARIOS]