package com.ingjuanfg.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class HomeNotasPage {
    public static final Target BOTON_CREAR_NOTA = the("Boton para crear nota").located(By.id("com.atomczak.notepat:id/new_note_fab"));
    public static final Target TITULO_NOTA_HOME = the("Titulo Nota en el Home").located(By.xpath("(//android.widget.TextView[contains(@resource-id, 'note_list_title_text')])[1]"));
}
