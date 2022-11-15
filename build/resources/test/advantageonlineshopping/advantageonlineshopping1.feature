@test
Feature: Ver al menos tres redes sociales

  Yo como usuario de la pagina demo
  necesito  una opcion de buscar
  para hacer busqueda de productos por palabras claves o referencias puntuales de productos tecnologicos


  Scenario: el usuario deberia  poder ver un icono de buisqueda para poder digitar
    Given que el usuario esta en la seccion home de la pagina
    When la pagana carga todo su contenido
    Then deberia poder ver un icono que le permita digitgar nombres de productos


  Scenario: el usuario deberia  poder encontrar articulos con la palabra buscada
    Given que el usuario esta en la seccion inicial de la pagina
    When ingresa un nombre de articulo
    |articuloBuscado|
    |Chromebook     |
    Then deberia poder ver productos con nombre relacionados con la palabra introducida


  Scenario: el usuario deberia  poder ver la categoria a la que pertenece los productos desplegados
    Given que el usuario esta en la seccion   home de la pagina demo
    When realiza la busqueda de un articulo
      |articuloBuscado|
      |Chromebook     |
    Then deberia poder ver la categoria a la que pertenece el producto que coincide con su criterio de busqueda



  Scenario: el usuario deberia poder ver que el producto que relaciono en la busqueda no existe
    Given que el usuario esta en la seccion   home de la pagina oficial
    When realiza la busqueda de un articulo que no existe
      |articuloNoExiste|
      | mm             |
    Then deberia poder ver el mensaje que el producto no existe



