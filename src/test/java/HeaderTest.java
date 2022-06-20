import org.junit.Test;
import page.object.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static page.object.MainPage.BASE_URL;

public class HeaderTest {

  @Test
  public void logoClickProvideToMainPage() {
    MainPage mainPage = open("https://scorpiolikeyou.com/zodiac/leo", MainPage.class);
    mainPage.clickLogoHeader();
    webdriver().shouldHave(url(BASE_URL));
  }
}
