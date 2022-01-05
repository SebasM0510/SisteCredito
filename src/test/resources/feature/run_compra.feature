Feature: Yo como usuario deseo ingresar al sitio web
          Para agregar un producto al carrito de compra

  Scenario: Agregar producto al carrito de compras
    Given que el usuario ingreso al sitio web https://www.falabella.com.co/falabella-co
    When agrega un producto al carrito de compras
    Then debe visualizar la opcion pago