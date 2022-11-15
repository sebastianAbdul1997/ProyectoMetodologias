@test
Feature: Ver al menos tres redes sociales

  Yo como mercaderista de demo
  necesito  que en la parte inferior de la pagina web aparezcan los links de redes sociales
  para que el usuario tenga la opcion de seguirnos en las diferentes redes sociales
  @Test1
  Scenario: el usuario deberia  poder ver en la parte inferior de la pagina al menos tres redes sociales
    Given que el usuario ingresa a la pagina de inicio
    When esta en la parte inferior de la pagina
    Then deberia poder ver minino tres redes sociales



