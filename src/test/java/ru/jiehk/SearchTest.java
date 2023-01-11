package ru.jiehk;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTest {
    @Test
    void successfulSearchTest() {
        open("https://www.google.com/");
        $("[name=q]").setValue("mail").pressEnter();
        $("[id=search]").shouldHave(text("https://mail.ru"));
    }
}
