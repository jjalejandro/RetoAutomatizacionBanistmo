
Feature: Verificar carrito de compras
  Yo como automatizador de pruebas
  Necesito agregar y eliminar productos del carrito de compras
  Para validar la correcta funcionalidad de este

  Scenario: Adicion de productos al carrito de compras
    Given Desea navegar a la pagina con la siguiente url "http://practice.automationtesting.in/shop/"
    When Quiere comprar los productos con los nombres de "Android Quick Start Guide" y "Functional Programming in JS"
    And Elimina un producto del carrito de compras
    Then Valida que el precio total es menor a "400"

