package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.PaginaInicio;

public class ValidarOpcionPago implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return PaginaInicio.pagoTarjeta.isVisibleFor(actor);
    }

    public static ValidarOpcionPago con (){
        return new ValidarOpcionPago();
    }
}
