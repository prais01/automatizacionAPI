# new feature
# Tags: optional

Feature: Login Entel

  @entelpreprod
  Scenario: Login exitoso
    Given Ingreso el numero de celular y hago en clic en numero de cliente
    And Hacemos clic en el boton de continuar
    And Ingresamos la contraseña en el campo uno "1"
    And Ingresamos la contraseña en el campo dos "1"
    And Ingresamos la contraseña en el campo tres "1"
    And Ingresamos la contraseña en el campo cuatro "1"
    And Ingresamos la contraseña en el campo cinco "2"
    And Ingresamos la contraseña en el campo seis "2"
    When se muestra el dashboard
    Then valido el acceso con el texto ""