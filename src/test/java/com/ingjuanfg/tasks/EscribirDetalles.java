package com.ingjuanfg.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static com.ingjuanfg.userinterfaces.CrearNotaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EscribirDetalles implements Task {
    private List<Map<String,String>> informacion;

    public EscribirDetalles(List<Map<String,String>> informacion){
        this.informacion = informacion;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Enter.theValue(informacion.get(0).get("titulo")).into(CAMPO_TITULO_NOTA),
                Enter.theValue(informacion.get(0).get("contenido")).into(CAMPO_CONTENIDO_NOTA),
                Click.on(BOTON_ACCION_NOTA.of("GUARDAR")),
                Click.on(VOLVER_HOME_NOTA)
        );
    }

    public static EscribirDetalles paraNotaNueva(List<Map<String,String>> informacion){
        return instrumented(EscribirDetalles.class, informacion);
    }
}
