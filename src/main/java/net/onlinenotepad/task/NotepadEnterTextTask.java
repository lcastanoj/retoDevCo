package net.onlinenotepad.task;

import net.onlinenotepad.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static net.onlinenotepad.userinterface.NotepadHomeUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NotepadEnterTextTask implements Task {
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            leerExcel = Excel.leerDatosDeHojaDeExcel("data/Datos.xlsx", "Texto");
        } catch (IOException e) {
            throw new RuntimeException();
        }

        actor.attemptsTo(
                Click.on(BTN_RICH_TEXT),
                Click.on(BTN_BOLD),
                Click.on(TXT_TEXTO),
                Enter.theValue(leerExcel.get(0).get("Texto")).into(TXT_TEXTO).thenHit(Keys.ENTER)
        );

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Performable NotepadEnterTextTask() {
        return instrumented(NotepadEnterTextTask.class);
    }
}
