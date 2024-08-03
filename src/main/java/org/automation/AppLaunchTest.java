package org.automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppLaunchTest {
    public static void main(String[] args) throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "RZ8M61X76FZ"); // Change to your device name or emulator
        caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\harsh\\Desktop\\PREPROD_adtech.apk"); // Correct file path

        // Initialize the driver
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);

        // Your test code here
        System.out.println("Application launched successfully!");

        // Quit the driver
        driver.quit();
}
}