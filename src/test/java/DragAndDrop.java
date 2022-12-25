import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {


    @BeforeEach
    public void work(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
    }

    @Disabled
    @Tag("Dont Work")
    @Test
    void selenideActions(){
        actions()
                .moveToElement($("#column-a"))
                .clickAndHold()
                .moveByOffset(300,0)
                .release()
                .perform();

        $("#column-a").shouldHave(text("B"));
    }

    @Test
     void dragAndDrop() {
        $("#column-a")
                .dragAndDropTo("#column-b")
                .shouldHave(text("B"));
    }
}
