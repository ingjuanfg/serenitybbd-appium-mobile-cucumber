#language: es

Característica: Crear Notas
  Yo como usuario
  Quiero crear notas
  Para recordar mis tareas

  Escenario: Crear una nota exitosa
    Dado que Juan esta en la app
    Cuando crea una nota de mercado
      | titulo           | contenido     |
      | Lista de Mercado | Arroz y pollo |
    Entonces El deberia de ver la nota creada con exito