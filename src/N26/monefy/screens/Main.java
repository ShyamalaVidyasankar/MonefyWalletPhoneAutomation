package N26.monefy.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Main {

    public AndroidElement incomeButton;
    public AndroidElement expenseButton;
    public AndroidElement balanceButton;
    public AndroidElement rightPanelButton;
    public AndroidElement eating;
    public AndroidElement house;
    public AndroidElement food;
    public AndroidElement car;
    public AndroidElement toiletry;
    public AndroidElement sport;
    public AndroidElement health;
    public AndroidElement communication;
    public AndroidElement entertainment;
    public AndroidElement clothes;
    public AndroidElement taxi;
    public AndroidElement transport;

    public Main(AndroidDriver<AndroidElement> driver){
        incomeButton = driver.findElementById("com.monefy.app.lite:id/income_button");
        expenseButton = driver.findElementById("com.monefy.app.lite:id/expense_button");
        balanceButton = driver.findElementById("com.monefy.app.lite:id/balance_amount");
        rightPanelButton = driver.findElementById("com.monefy.app.lite:id/overflow");

        //Expense options:
        eating = driver.findElementByXPath("//android.widget.ImageView[@index='1']");
        house = driver.findElementByXPath("//android.widget.ImageView[@index='2']");
        food = driver.findElementByXPath("//android.widget.ImageView[@index='3']");
        car = driver.findElementByXPath("//android.widget.ImageView[@index='13']");
        toiletry = driver.findElementByXPath("//android.widget.ImageView[@index='15']");
        sport = driver.findElementByXPath("//android.widget.ImageView[@index='21']");
        health = driver.findElementByXPath("//android.widget.ImageView[@index='20']");
        communication = driver.findElementByXPath("//android.widget.ImageView[@index='19']");
        entertainment = driver.findElementByXPath("//android.widget.ImageView[@index='18']");
        clothes = driver.findElementByXPath("//android.widget.ImageView[@index='10']");
        taxi = driver.findElementByXPath("//android.widget.ImageView[@index='8']");
        transport = driver.findElementByXPath("//android.widget.ImageView[@index='0']");

    }
}
