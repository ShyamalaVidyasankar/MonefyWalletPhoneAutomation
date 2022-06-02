package N26.monefy.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class NewExpenses {
    public AndroidElement categoryButton;

    public NewExpenses(AndroidDriver<AndroidElement> driver){
        categoryButton = driver.findElementById("com.monefy.app.lite:id/textViewChooseCategory");

    }

}
