package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.exceptions.CreacionNotaFallidaException;
import com.ingjuanfg.interactions.Crear;
import com.ingjuanfg.questions.NotaEsCreada;
import com.ingjuanfg.tasks.EscribirDetalles;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static com.ingjuanfg.exceptions.CreacionNotaFallidaException.MENSAJE_ERROR_CREACION_NOTA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearNotaMercadoStepDefinition {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que {word} esta en la app")
    public void queEstaEnLaApp(String nombreActor) {
       theActorCalled(nombreActor).attemptsTo(
               Crear.notaNueva()
       );
    }

    @Cuando("crea una nota de mercado")
    public void creaNotaMercado(List<Map<String,String>> informacionNota) {
        theActorInTheSpotlight().attemptsTo(
                EscribirDetalles.paraNotaNueva(informacionNota)
        );
    }

    @Entonces("El deberia de ver la nota creada con exito")
    public void elDeberiaDeVerNotaCreadaExito() {
        theActorInTheSpotlight()
                .should(seeThat
                        (NotaEsCreada.deManeraExitosa())
                        .orComplainWith(CreacionNotaFallidaException.class, MENSAJE_ERROR_CREACION_NOTA));
    }
}
