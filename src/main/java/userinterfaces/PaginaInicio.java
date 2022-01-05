package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaInicio {

    public static Target contenedorCategoria = Target.the("Contenedor categoria")
            .locatedBy("//div[contains(@class,'HoldingBanner-module_container-desktop')]");

    public static Target categoria = Target.the("Categoria vestuario hombres")
            .locatedBy("//a[contains(@href, 'Moda-Hombre')]");

    public static Target recomendados = Target.the("Texto recomendado")
            .locatedBy("//span[text()='Recomendados']");

    public static Target producto = Target.the("producto compra")
            .locatedBy("//div[@id='testId-searchResults-products']/div[{0}]//a");

    public static Target talla = Target.the("elegir talla")
            .locatedBy("//button[@id='testId-sizeButton-XL']");

    public static Target agregarProducto = Target.the("agregar camiseta")
            .locatedBy("//button[text()='Agregar a la Bolsa']");

    public static Target verBolsa = Target.the("ver bolsa")
            .locatedBy("//a[text()='Ver Bolsa de Compras']");

    public static Target irAComprar = Target.the("ir a comprar")
            .locatedBy("//button[text()='Ir a comprar']");

    public static Target departamento = Target.the("elegir departamento")
            .locatedBy("//option[text()='ANTIOQUIA']");

    public static Target ciudad = Target.the("elegir ciudad")
            .locatedBy("//option[text()='MEDELLIN']");

    public static Target barrio = Target.the("elegir barrio")
            .locatedBy("//option[text()='Por favor selecciona un barrio']/following-sibling::option[text()='MEDELLIN']");
    //TODO: Revisar xPath del boton Continuar
    public static Target continuarCompra = Target.the("continuar")
            .locatedBy("//div[@id='fbra_checkoutRegionAndComuna']//button[text()='Continuar']");

    public static Target direccion = Target.the("direccion")
            .locatedBy("//input[@id='address']");

    public static Target numeroApartamento = Target.the("numero de apartamento")
            .locatedBy("//input[@id='departmentNumber']");

    public static Target ingresarDireccion = Target.the("ingresar direccion")
            .locatedBy("//button[contains(text(),'Ingresar direcci')]");

    public static Target irAPagar = Target.the("ir a pagar")
            .locatedBy("//h1[text()='Ir a pagar']");

    public static Target continuarPago = Target.the("continuar pago")
            .locatedBy("//div[@class='fbra_loadingWrapper']//button[text()='Continuar']");

    public static Target medioPago = Target.the("medio de pago")
            .locatedBy("//h2[text()='Elige tu medio de pago']");

    public static Target pagoTarjeta = Target.the("pago con tarjeta")
            .locatedBy("//div[text()='Pagar con Gift Card o Tarjeta de Novios']");
}

