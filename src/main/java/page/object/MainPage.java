package page.object;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {

    public static final String BASE_URL = "https://scorpiolikeyou.com/";

    //локатор портала в хедере
    @FindBy(how = How.XPATH, using = ".//a[@class ='header_logo logo']")
    private SelenideElement logoHeader;

    //локатор поля поиска
    @FindBy(how = How.XPATH, using = ".//input[@placeholder = 'Enter your Zodiac sign here']")
    private SelenideElement searchForm;

    //локатор кнопки "Find"
    @FindBy(how = How.XPATH, using = ".//button[@class='mSearch_button']")
    private SelenideElement findButton;

    //метод клика на логотип портала в хедере
    public void clickLogoHeader() {
        logoHeader.click();
    }

    //метод, который объединяет заполнение поля поиска и нажатия на кнопку "Find"
    public void doSearchRequest() {
        searchForm.click();
        searchForm.setValue("pleasure");
        findButton.click();
    }
}


