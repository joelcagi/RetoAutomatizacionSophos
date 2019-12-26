package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.LinioHomePage;

public class Consultar implements Task {

    private String producto;

    public Consultar(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(producto).into(LinioHomePage.CAMPOPRODUCTOS),
        Click.on(LinioHomePage.BOTON_BUSCAR),
                Click.on(LinioHomePage.PRODUCTO_GAMEBOY));
    }

    public static Consultar unProducto(String producto) {
        return Tasks.instrumented(Consultar.class, producto);
    }
}
