package net.onlinenotepad.task;

import net.onlinenotepad.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static net.onlinenotepad.userinterface.NotepadHomeUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

public class NotepadAddItemListTask implements Task {
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            leerExcel = Excel.leerDatosDeHojaDeExcel("data/Datos.xlsx", "Texto");
        } catch (IOException e) {
            throw new RuntimeException();
        }

        actor.attemptsTo(
                Click.on(BTN_TASKLIST),
                Enter.theValue(leerExcel.get(0).get("Lista")).into(TXT_TASKLIST).thenHit(ENTER),
                Enter.theValue(leerExcel.get(1).get("Lista")).into(TXT_TASKLIST).thenHit(ENTER),
                Enter.theValue(leerExcel.get(2).get("Lista")).into(TXT_TASKLIST).thenHit(ENTER),
                Enter.theValue(leerExcel.get(3).get("Lista")).into(TXT_TASKLIST).thenHit(ENTER),
                Enter.theValue(leerExcel.get(4).get("Lista")).into(TXT_TASKLIST).thenHit(ENTER)
        );
    }

    public static Performable NotepadAddItemListTask() {
        return instrumented(NotepadAddItemListTask.class);
    }
}
