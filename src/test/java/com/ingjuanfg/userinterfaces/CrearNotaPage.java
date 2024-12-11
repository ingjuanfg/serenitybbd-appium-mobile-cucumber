package com.ingjuanfg.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class CrearNotaPage {
    public static final Target CAMPO_TITULO_NOTA = the("Campo para titulo de la nota")
            .located(By.id("com.atomczak.notepat:id/textNoteTitleEdit"));
    public static final Target CAMPO_CONTENIDO_NOTA = the("Campo para contenido de la nota")
            .located(By.id("com.atomczak.notepat:id/textNoteContentEdit"));
    public static final Target BOTON_ACCION_NOTA = the("Boton para la nota").locatedBy("//android.widget.TextView[@text='{0}']");

    public static final Target VOLVER_HOME_NOTA = the("Boton para volver al Home de notas")
            .locatedForAndroid(AppiumBy.accessibilityId("Desplazarse hacia arriba"))
            .locatedForIOS(AppiumBy.accessibilityId("iOS"));
}
