package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Responder;
import tasks.Abrir;
import tasks.Agregar;
import tasks.Consultar;

public class LinioStepDefinitions {

    @Before
    public void configuracionInicial(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) quiere ingresar a pagina de linio$")
    public void queUsuarioQuiereIngresarAPaginaDeLinio(String usuario){
        OnStage.theActorCalled(usuario).wasAbleTo(Abrir.aLaPaginaDeLinio());
    }


    @Cuando("^consulta un producto (.*)$")
    public void consultaUnProducto(String producto){
        OnStage.theActorInTheSpotlight().attemptsTo(Consultar.unProducto(producto));
    }

    @Cuando("^lo agrega al carrito de compras$")
    public void agregarAlCarritoDeCompras() {
        OnStage.theActorInTheSpotlight().attemptsTo(Agregar.alCarritoDeCompras());
    }

    @Entonces("^el deberia ver que (.*)$")
    public void elDeberiaVerQueElProductoSeAgregoExitosamente(String pregunta) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.la(pregunta)));
    }


}
