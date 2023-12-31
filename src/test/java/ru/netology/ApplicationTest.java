package ru.netology;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;

import static com.codeborne.selenide.Condition.exactText;


class ApplicationTest {
    @Test
    public void ShouldTestApplication() {

        open("http://localhost:9999");
        $("[data-test-id=name] input").setValue("Игорь");
        $("[data-test-id=phone] input").setValue("+79999999999");
        $("[data-test-id=agreement]").click();
        $("[type=button]").click();
        $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }

}

