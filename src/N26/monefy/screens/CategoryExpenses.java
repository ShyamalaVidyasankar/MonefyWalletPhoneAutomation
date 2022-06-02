package N26.monefy.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CategoryExpenses {
    public AndroidElement bills;
    public AndroidElement car;
    public AndroidElement clothes;
    public AndroidElement communications;
    public AndroidElement eating;
    public AndroidElement entertainment;
    public AndroidElement food;
    public AndroidElement gifts;
    public AndroidElement health;
    public AndroidElement house;
    public AndroidElement pets;
    public AndroidElement sports;
    public AndroidElement taxi;
    public AndroidElement toiletry;
    public AndroidElement transport;

    public CategoryExpenses(AndroidDriver<AndroidElement> driver){
        bills=  driver.findElementByXPath("//*[@text='Bills']");
        car=  driver.findElementByXPath("//*[@text='Car']");
        clothes=  driver.findElementByXPath("//*[@text='Clothes']");
        communications =  driver.findElementByXPath("//*[@text='Communications']");
        eating =  driver.findElementByXPath("//*[@text='Eating out']");
        entertainment = driver.findElementByXPath("//*[@text='Entertainment']");
        food =  driver.findElementByXPath("//*[@text='Food']");
        gifts =  driver.findElementByXPath("//*[@text='Gifts']");
        health =  driver.findElementByXPath("//*[@text='Health']");
        house =  driver.findElementByXPath("//*[@text='House']");
        pets =  driver.findElementByXPath("//*[@text='Pets']");
        sports =  driver.findElementByXPath("//*[@text='Sports']");
        taxi =  driver.findElementByXPath("//*[@text='Taxi']");
        toiletry =  driver.findElementByXPath("//*[@text='Toiletry']");
        transport =  driver.findElementByXPath("//*[@text='Transport']");

    }

}
