package net.onlinenotepad.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.onlinenotepad.userinterface.NotepadHomeUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NotepadDeleteItemListTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_DELETE));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Performable NotepadDeleteItemListTask() {
        return instrumented(NotepadDeleteItemListTask.class);
    }
}
