package org.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//interview Shikha keywords used in the main method
public class WebLaunch {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       // WebDriverManager driver = new ChromeDriverManager();
        driver.get("https://www.saucedemo.com");


      //  driver.get("\"https://www.saucedemo.com/\"");



    }
}


