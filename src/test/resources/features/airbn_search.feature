Feature: Búsqueda en Airbnb

  @test
  Scenario: Búsqueda simple de hospedaje

    Given que me encuentro en el login de Airbnb
    When busco "Cancun Mexico"
    Then muestra el texto "Display total before taxes"


  @examen
  Scenario: Busqueda de hoteles en AIRBNB
    Given que me encuentro en el login de Airbnb
    When buscamos "Vichayito"
    Then se muestra el texto "Over 1,000 places"
    And valido que los resultados sean mayores a 0
