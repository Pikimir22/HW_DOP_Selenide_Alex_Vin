import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class GitHubTest {
    @Test
    public void hw (){
        open("https://github.com/");

        $(withText("Solutions")).hover();
        $(withText("Enterprise")).click();
        $(".h1-mktg.mb-3.color-fg-default").shouldHave(text("Build like the best"));

    }
}
