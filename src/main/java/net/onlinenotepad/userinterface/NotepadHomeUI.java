package net.onlinenotepad.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NotepadHomeUI {
    public static final Target BTN_RICH_TEXT = Target.the("btn rich text").located(By.id("richtextnote-tab"));
    public static final Target BTN_BOLD = Target.the("btn bold").locatedBy("//button[contains(.,'Bold (Ctrl+B)Bold')]");
    public static final Target TXT_TEXTO = Target.the("txt").locatedBy("//div[contains(@id,'editor')]");

    public static final Target BTN_TASKLIST = Target.the("btn task list").located(By.id("tasklist-tab"));
    public static final Target TXT_TASKLIST = Target.the("txt task list").located(By.id("my-list"));
    public static final Target BTN_DELETE = Target.the("btn delete item").locatedBy("(//img[contains(@class,'item')])[4]");
}
