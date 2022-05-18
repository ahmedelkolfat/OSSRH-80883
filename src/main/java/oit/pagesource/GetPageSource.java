package oit.pagesource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GetPageSource {
    public static WebDriver driver;
    public String source;
    public WebElement element;
    public String textwanted;
    public String valueOfAttribute;

    public GetPageSource(WebDriver driver) {
        this.driver = driver;
    }


    public String innerHTMLForElement(String xpath) {

        element = driver.findElement(By.xpath(xpath));
        textwanted = element.getAttribute("innerHTML");
        return textwanted;

    }

    public String innerTextForElement(String xpath) {

        element = driver.findElement(By.xpath(xpath));
        textwanted = element.getAttribute("innerText");
        return textwanted;

    }


    public String valueForAttribute(String xpath, String attributeName) {

        element = driver.findElement(By.xpath(xpath));
        valueOfAttribute = element.getAttribute(attributeName);
        return valueOfAttribute;

    }

    public int listsInsideULTag(By locator, By tagName) {

        WebElement ul = driver.findElement(locator);
        List<WebElement> li = ul.findElements(tagName);
        for (int i = 0; i < li.size(); i++) {
        }
        return li.size();
    }

    //get innerHTML text in div s
    public String textInsideTag(String locator) {
        WebElement listOfResults = driver.findElement(By.xpath(locator));
        return listOfResults.getText();
    }

    public String textInsideULlists(String xpathOfULTag) {

        WebElement listOfResults = driver.findElement(By.xpath(xpathOfULTag));
        String allResults = listOfResults.getText();
        return allResults;
    }

    //to get size of the element in the page if it is exist or not
    public int elementSize(String x) {
        int listOfResults = driver.findElements(By.xpath(x)).size();
        return listOfResults;
    }

    //to know the selected item from drop down
    public String selectedItemFromList(By locator) {

        Select select = new Select(driver.findElement(locator));
        WebElement option = select.getFirstSelectedOption();
        String defaultItem = option.getText();
        return defaultItem;
    }

    public String replaceStringValue(String string, String target, String replacement) {
        String newString;
        newString = string.replace(target, replacement);
        return newString;
    }
}
