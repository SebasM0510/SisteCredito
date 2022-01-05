package stepdefinitions;

import excepctions.ExceptionOpcionPagoNoEncontrada;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.ValidarOpcionPago;
import tasks.AgregarProducto;

import java.util.regex.Matcher;

public class RunCompraStepDefinitions {
    @Managed(driver="chrome")
    WebDriver driver;
    @Before
    public void configuracion(){
        Actor sebas=Actor.named("Sebas");
        sebas.can(BrowseTheWeb.with(driver));
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("sebas");
    }
    @Given("^que el usuario ingreso al sitio web (.*)$")
    public void queElUsuarioIngresoAlSitioWeb(String url) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }
    @When("agrega un producto al carrito de compras")
    public void agregaUnProductoAlCarritoDeCompras() {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProducto.conLosDatos());
    }
    @Then("debe visualizar la opcion pago")
    public void debeVisualizarLaOpcionPago() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen
                .seeThat(ValidarOpcionPago.con(), Matchers.equalTo(true))
                .orComplainWith(ExceptionOpcionPagoNoEncontrada.class,"La opcion de pago no se encontro"));
    }
}
