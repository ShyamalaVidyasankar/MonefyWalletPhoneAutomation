package N26.monefy.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CategoryIncomes {
    public AndroidElement deposit;
    public AndroidElement salary;
    public AndroidElement saving;

    public CategoryIncomes(AndroidDriver<AndroidElement> driver){
      deposit = driver.findElementByXPath("//*[@text='Deposits']");
      salary = driver.findElementByXPath("//*[@text='Salary']");
      saving = driver.findElementByXPath("//*[@text='Savings']");
    }

}
