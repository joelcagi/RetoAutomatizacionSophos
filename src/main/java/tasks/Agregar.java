package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.LinioHomePage;

public class Agregar implements Task {
    public static Agregar alCarritoDeCompras() {
        return Tasks.instrumented(Agregar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LinioHomePage.OPCIONES),
                Click.on(LinioHomePage.AGREGAR_AL_CARRITO));
    }
}
