package com.ingjuanfg.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.ingjuanfg.userinterfaces.HomeNotasPage.TITULO_NOTA_HOME;

public class NotaEsCreada implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return TITULO_NOTA_HOME.resolveFor(actor).isVisible();
    }

    public static NotaEsCreada deManeraExitosa(){
        return new NotaEsCreada();
    }
}
