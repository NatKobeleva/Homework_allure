package ru.netology.patterns;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DeliveryCardTest {

    @Test
    void shouldChangeDateAndOrderCard() {
        open("http://localhost:9999");

        DataGenerator.UserInfo validUser = DataGenerator.Registration.generateUser("ru");
        $("[data-test-id=city] input").setValue(validUser.getCity());

        /*$("[data-test-id=date] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        String planningDate = generateDate(3, "dd.MM.yyyy");
        $("[data-test-id=date] input").setValue(planningDate);
        $("[data-test-id=name] input").setValue("Наталья Кобелева");
        $("[data-test-id=phone] input").setValue("+79630000000");
        $("[data-test-id=agreement]").click();
        $("button.button").click();
        $(".notification__content")
                .shouldBe(Condition.visible, Duration.ofSeconds(15))
                .shouldHave(Condition.exactText("Встреча успешно забронирована на " + planningDate));
    }
}*/
