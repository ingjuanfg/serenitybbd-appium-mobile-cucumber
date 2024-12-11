package com.ingjuanfg.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static com.ingjuanfg.userinterfaces.HomeNotasPage.BOTON_CREAR_NOTA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Crear implements Interaction {

    @Override
    @Step("{0} Desea crear una nota nueva")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_CREAR_NOTA)
        );
    }

    public static Crear notaNueva() {
        return instrumented(Crear.class);
    }
}

