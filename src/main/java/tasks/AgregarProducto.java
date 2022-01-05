package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import static userinterfaces.PaginaInicio.*;

public class AgregarProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Scroll.to(contenedorCategoria),
            Click.on(categoria),
            Scroll.to(recomendados),
            Click.on(producto.of("2")),
            Click.on(talla),
            Click.on(agregarProducto),
            Click.on(verBolsa),
            Click.on(irAComprar),
            Click.on(departamento),
            Click.on(ciudad),
            Click.on(barrio),
            Click.on(continuarCompra),
            Enter.theValue("CL 56 # 78-11").into(direccion),
            Enter.theValue("Piso 2").into(numeroApartamento),
            Click.on(ingresarDireccion),
            Scroll.to(irAPagar),
            Click.on(continuarPago),
            WaitUntil.the(medioPago, isVisible()).forNoMoreThan(Duration.ofSeconds(10)));
    }
    public static AgregarProducto conLosDatos(){
        return Tasks.instrumented(AgregarProducto.class);
    }
}
