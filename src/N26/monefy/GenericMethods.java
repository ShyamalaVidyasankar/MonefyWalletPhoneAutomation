package N26.monefy;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;

public class GenericMethods {

    public static AndroidDriver<AndroidElement> driver;

    public static AndroidDriver<AndroidElement> capabilities() throws Exception {
        File apkPath = new File("src");
        File apkName = new File(apkPath, "com.monefy.app.lite_2019-10-27.apk");
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "N26phone");
        cap.setCapability(MobileCapabilityType.APP, apkName.getAbsolutePath());
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), cap);
        return driver;
    }

    public static void printMsg(String value) {
        System.out.println(value);
    }

    public static String readValue() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static void typeAmountId(String value, AndroidDriver<AndroidElement> driver) {
        int aLength = value.length();
        int begging = 0;
        String dot = ".";
        driver.findElementById("com.monefy.app.lite:id/buttonKeyboardPlus").click();
        for (int i = 1; i <= aLength; i++) {
            String aSubstring = value.substring(begging, i);
            if (aSubstring.equals(dot)) {
                aSubstring = "Dot";
            }

            driver.findElementById("com.monefy.app.lite:id/buttonKeyboard" + aSubstring).click();
            begging++;
        }
    }

    public static BigDecimal str2BigDecimal(String num) {
        BigDecimal newValue;
        newValue = new BigDecimal(num).setScale(2, RoundingMode.DOWN);
        return newValue;
    }

    public static String removeChar(String str, String charValue) {
        int aLength = charValue.length();
        int begging = 0;
        for (int i = 1; i <= aLength; i++) {
            String aSubstring = charValue.substring(begging, i);
            str = str.replace(aSubstring, "");
            begging++;
        }
        return str;
    }

    public static boolean areEqual(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.equals(secondNumber);
    }

    public static boolean isNumeric(String str) {
        try {
            BigDecimal newValue = new BigDecimal(str).setScale(2, RoundingMode.DOWN);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void closeDriver() {
        driver.quit();
    }

}